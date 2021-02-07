package com.harish.services;

import com.harish.models.Post;
import io.restassured.response.Response;

import java.util.List;

public interface PostService {
    public Response getAllPosts();
    public Response addPost(final Post po);
}
