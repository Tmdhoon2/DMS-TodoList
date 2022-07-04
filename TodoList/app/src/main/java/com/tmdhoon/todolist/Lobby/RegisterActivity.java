package com.tmdhoon.todolist.Lobby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;

import com.tmdhoon.todolist.Api.ApiProvider;
import com.tmdhoon.todolist.Api.ServerApi;
import com.tmdhoon.todolist.Register.RegisterRequest;
import com.tmdhoon.todolist.Register.RegisterResponse;
import com.tmdhoon.todolist.databinding.ActivityRegisterBinding;
import com.tmdhoon.todolist.databinding.FragmentMypageBinding;

import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;
    private FragmentMypageBinding binding1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        binding1 = FragmentMypageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register();
            }
        });



    }



    private void Register(){
        String userName = binding.etRegisterName.getText().toString();
        int userAge = Integer.parseInt(binding.etRegisterAge.getText().toString());
        String userId = binding.etRegisterId.getText().toString();
        String userPw = binding.etRegisterPw.getText().toString();
        String userPwcheck = binding.etRegisterPwCheck.getText().toString();

        if(userName.trim().length() == 0 || userId.trim().length() == 0 || userPw.trim().length() == 0 || userAge <=0){
            Toast.makeText(RegisterActivity.this, "모든 항목을 입력해주세요", Toast.LENGTH_SHORT).show();
        } else if(userPw != userPwcheck){
            Toast.makeText(RegisterActivity.this, "비밀번호 확인이 다릅니다", Toast.LENGTH_SHORT).show();
        } else{
            RegisterResponse();
        }
    }

    public void RegisterResponse(){
        String userName = binding.etRegisterName.getText().toString().trim();
        int userAge = Integer.parseInt(binding.etRegisterAge.getText().toString());
        String userId = binding.etRegisterId.getText().toString().trim();
        String userPw = binding.etRegisterPw.getText().toString().trim();

        RegisterRequest registerRequest = new RegisterRequest(userName, userAge, userId, userPw);
        ServerApi serverApi = ApiProvider.getInstance().create(ServerApi.class);

        serverApi.Signup(registerRequest).enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                if(response.code() == 200){
                    binding1.tvName.setText(response.body().getUserName());
                    binding1.tvAge.setText(response.body().getUserAge());
                }else{
                    Toast.makeText(RegisterActivity.this, "오류", Toast.LENGTH_SHORT).show();
                }

                finish();
            }

            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {
                Toast.makeText(RegisterActivity.this, "통신 실패", Toast.LENGTH_SHORT).show();
            }
        });
    }


}