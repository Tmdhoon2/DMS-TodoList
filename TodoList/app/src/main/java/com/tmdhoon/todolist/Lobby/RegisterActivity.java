package com.tmdhoon.todolist.Lobby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.tmdhoon.todolist.Api.ApiProvider;
import com.tmdhoon.todolist.ApiMethod;
import com.tmdhoon.todolist.databinding.ActivityRegisterBinding;

import retrofit2.Retrofit;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.etRegisterName.getText().toString();
        binding.etRegisterAge.getText();
        binding.etRegisterId.getText().toString();
        binding.etRegisterPw.getText().toString();

        ApiMethod apiMethod = ApiProvider.getRetrofit().create(ApiMethod.class);

        binding.btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiMethod
            }
        });



    }
}