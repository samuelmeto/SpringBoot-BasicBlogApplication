package com.example.blog.controller;

import com.example.blog.model.PostModel;
import com.example.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")

public class PostController{
    @Autowired
    private PostService postService;
    @PostMapping
    public PostModel createPost(@RequestBody PostModel postModel){//Json tipinde gelen veriyi postModel nesnesine dönüştürür
        return postService.createPost(postModel);
    }
    @PutMapping("/{id}")
    public PostModel updatePost(@PathVariable Long id, @RequestBody PostModel postModel){
        return postService.updateById(id, postModel);
    }
    @GetMapping("/{id}")
    public PostModel findPostById(@PathVariable Long id){
        return postService.findById(id);
    }
    @GetMapping
    public List<PostModel> findAll(){
        return postService.findAll();
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        postService.deletePost(id);
    }
}
