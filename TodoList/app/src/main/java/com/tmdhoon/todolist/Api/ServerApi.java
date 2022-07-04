package com.tmdhoon.todolist.Api;

import com.tmdhoon.todolist.Login.LoginRequest;
import com.tmdhoon.todolist.Login.LoginResponse;
import com.tmdhoon.todolist.Register.RegisterRequest;
import com.tmdhoon.todolist.Register.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServerApi {

    @POST("users/signin")
    Call<LoginResponse> Signin(
            @Body LoginRequest loginRequest
    );

    @POST("users/signup")
    Call<RegisterResponse> Signup(
            @Body RegisterRequest registerRequest
    );

}
