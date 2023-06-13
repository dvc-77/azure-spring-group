package com.slightlytechie.blog.repository;

import com.slightlytechie.blog.api.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findById(Long id);       // Find a post by ID

    List<Post> findAll();           // Find all posts

    @SuppressWarnings("unchecked")
    Post save(Post post);           // Save or update a post

    void deleteById(Long id);           // Delete a post by ID


    void deleteAll();       // Delete all posts

}
