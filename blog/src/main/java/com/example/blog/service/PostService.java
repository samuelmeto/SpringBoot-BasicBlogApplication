package com.example.blog.service;

import com.example.blog.model.PostModel;
import com.example.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//CRUD (create-read-update-delete)
@Service
public class PostService {

   @Autowired //PostRepository classının yöntemleri burda da kullanılabilir
    private PostRepository postRepository;

    public PostModel createPost(PostModel postModel){
        return postRepository.save(postModel);
    }
    public List<PostModel> findAll(){
        return postRepository.findAll();
    }
    public PostModel findById(Long id){
        return postRepository.findById(id).orElse(null);
    }
    public PostModel updateById(Long id, PostModel updatedPost){
        PostModel existingPost = findById(id);
        if(existingPost != null){
            existingPost.setTitle(updatedPost.getTitle());
            existingPost.setContent(updatedPost.getContent());
            return postRepository.save(existingPost);
        }
        else
            throw new RuntimeException("Post not found with id" + id);
    }
    public void deletePost(Long id){
        postRepository.deleteById(id);
    }

}
