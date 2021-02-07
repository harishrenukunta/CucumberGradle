package com.harish.stepdefs;

import com.harish.models.Post;
import com.harish.services.PostServiceImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.gson.Gson;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import org.apache.http.HttpStatus;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RequiredArgsConstructor
public class PostStepDefs extends BaseStep {

    private final PostServiceImpl postService;
    private Response postServiceResponse;

    @When("retrieve all posts")
    public void retrieveAllPosts() {
        postServiceResponse = postService.getAllPosts();
    }

    @Then("post service api call should be successful")
    public void postCallIsSuccessful(){
        assertThat(postServiceResponse)
                .as("Posts get service call is successful")
                .extracting("statusCode")
                .isEqualTo(HttpStatus.SC_OK);
    }

    @Then("user add post api call is successful")
    public void addPostCallIsSuccessful(){
        assertThat(postServiceResponse)
                .as("Add post is successful")
                .extracting("statusCode")
                .isEqualTo(HttpStatus.SC_CREATED);

    }

    @When("user adds a post")
    public void addPostStep(Post po){
        postServiceResponse = postService.addPost(po);
    }

    @And("posts should be retrieved")
    public void assertPostsAreRetrieved(){
        Post[] posts  = new Gson().fromJson(postServiceResponse.asString(), Post[].class);
        assertThat(posts)
                .as("Post service should send posts")
                .isNotEmpty();
    }
}
