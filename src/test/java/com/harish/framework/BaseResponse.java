package com.harish.framework;

import io.cucumber.messages.internal.com.google.gson.Gson;
import io.restassured.response.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PROTECTED)
public class BaseResponse {

    final Response response;

    public <T> T fromJson(Class<T> clazz){
        return new Gson().fromJson(response.asString(), clazz);
    }

}
