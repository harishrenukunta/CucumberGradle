package com.harish.services;

import com.harish.framework.BaseRestService;
import com.harish.models.Post;
import io.cucumber.messages.internal.com.google.gson.Gson;
import io.restassured.response.Response;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl extends BaseRestService implements  PostService{
    private String url = "/posts";
    @Override
    public Response getAllPosts() {
       return get(url);
    }

    @Override
    public Response addPost(final Post post){
        final String json = new Gson().toJson(post, Post.class);
        return post(url, json);
    }
}
