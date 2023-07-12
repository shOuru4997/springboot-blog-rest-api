package com.example.springbootblogrestapi.service;

import com.example.springbootblogrestapi.payload.PostDTO;
import com.example.springbootblogrestapi.payload.PostResponse;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);
    PostResponse getAllPosts(int pageNo, int pageSize);
    PostDTO getPostById(long id);
    PostDTO updatePost(PostDTO postDTO, long id);
    void deletePostById(long id);
}
