package com.example.blog.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity //bu class veritabanında bir tabloya karşılık gelir.
@Table(name = "posts")
public class PostModel {
    @Id //entitiynin birincil anahtar oldugunu belirtir.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//artan şekilde sıralar.
    private Long id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createdAt;

    @PrePersist //veritabanına eklemeden hemen önce bu işlem yapılsın
    protected void onCreate(){
        createdAt = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
