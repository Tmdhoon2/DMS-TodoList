package com.tmdhoon.todolist;

import com.tmdhoon.todolist.Api.LoginRegisterResponse;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiMethod {
    @POST("users/signup")
    Call<LoginRegisterResponse> getPost();
}
