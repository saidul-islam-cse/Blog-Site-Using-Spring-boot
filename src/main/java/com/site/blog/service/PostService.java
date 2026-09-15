package com.site.blog.service;

import com.site.blog.entity.Post;
import com.site.blog.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public Post createPost(Post post){
        return postRepository.save(post);
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Long id){
        return postRepository.findById(id);
    }

    public Post updatePost(Long id, Post post){
        post.setId(id);
        return postRepository.save(post);
    }

    public void deletePost(Long id){
        postRepository.deleteById(id);
    }
}
