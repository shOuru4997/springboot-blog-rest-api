package com.example.springbootblogrestapi.service;

import com.example.springbootblogrestapi.payload.PostDTO;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);
    List<PostDTO> getAllPosts();
    PostDTO getPostById(long id);
}
