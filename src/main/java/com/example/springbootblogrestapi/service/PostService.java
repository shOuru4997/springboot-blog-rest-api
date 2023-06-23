package com.example.springbootblogrestapi.service;

import com.example.springbootblogrestapi.payload.PostDTO;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);
}
