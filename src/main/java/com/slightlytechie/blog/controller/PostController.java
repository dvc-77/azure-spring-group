package com.slightlytechie.blog.controller;
import com.slightlytechie.blog.api.Post;
import com.slightlytechie.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
        Optional<Post> post = postService.getPostById(id);
        return post.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = postService.getAllPosts();
        return ResponseEntity.ok(posts);
    }

    @PostMapping
    public ResponseEntity<List<Post>> createPosts(@RequestBody List<Post> posts) {
        List<Post> createdPosts = new ArrayList<>();
        for (Post post : posts) {
            post.setCreatedAt(new Date());
            Post createdPost = postService.createPost(post);
            createdPosts.add(createdPost);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPosts);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post post) {
        Optional<Post> existingPost = postService.getPostById(id);
        if (existingPost.isPresent()) {
            post.setId(id);
            post.setCreatedAt(existingPost.get().getCreatedAt());
            Post updatedPost = postService.updatePost(post);
            return ResponseEntity.ok(updatedPost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        Optional<Post> existingPost = postService.getPostById(id);
        if (existingPost.isPresent()) {
            postService.deletePost(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/clear")
    public ResponseEntity<Void> deleteAllPosts() {
        postService.deleteAllPosts();
        return ResponseEntity.noContent().build();
    }

}
