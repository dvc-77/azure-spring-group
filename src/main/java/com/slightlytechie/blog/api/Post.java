package com.slightlytechie.blog.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="post")
@JsonPropertyOrder({ "id", "title", "content", "author", "createdAt" })
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(nullable = false)
    @JsonProperty("title")
    private String title;

    @Lob
    @Column(nullable = false)
    @JsonProperty("content")
    private String content;

    @Column(nullable = false)
    @JsonProperty("author")
    private String author;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    @JsonProperty("createdAt")
    private Date createdAt;

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }
}