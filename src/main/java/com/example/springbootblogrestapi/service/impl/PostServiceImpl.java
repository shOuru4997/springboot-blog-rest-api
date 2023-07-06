package com.example.springbootblogrestapi.service.impl;

import com.example.springbootblogrestapi.entity.Post;
import com.example.springbootblogrestapi.payload.PostDTO;
import com.example.springbootblogrestapi.repository.PostRepository;
import com.example.springbootblogrestapi.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        Post post = mapToEntity(postDTO);
        Post newPost = postRepository.save(post);
        return mapToDto(newPost);
    }

    // Convert Entity into DTO
    private PostDTO mapToDto(Post post){
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setDescription(post.getDescription());
        postDTO.setContent(post.getContent());
        return postDTO;
    }

    // Convert DTO into Entity
    private Post mapToEntity(PostDTO postDTO){
        Post post = new Post();
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setContent(postDTO.getContent());
        return post;
    }
}
