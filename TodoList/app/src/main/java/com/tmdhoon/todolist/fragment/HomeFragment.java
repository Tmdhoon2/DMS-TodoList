package com.tmdhoon.todolist.fragment;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tmdhoon.todolist.R;
import com.tmdhoon.todolist.databinding.FragmentHomeBinding;
import com.tmdhoon.todolist.recyclerview.ReData;
import com.tmdhoon.todolist.recyclerview.TodoAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ArrayList<ReData> arrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TodoAdapter todoAdapter;
    private CheckBox checkBox;
    private TextView tvTodo;

   public View onCreateView(LayoutInflater inflater, ViewGroup containter,
                            Bundle savedInstanceState){
       View view = inflater.inflate(R.layout.fragment_home, containter, false);
//       View view1 = inflater.inflate(R.id.checkbox, containter, false);
//       View view2 = inflater.inflate(R.id.tvTodo, containter, false);

       recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
       recyclerView.setHasFixedSize(true);
       todoAdapter = new TodoAdapter(arrayList);

       RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

       recyclerView.setLayoutManager(layoutManager);
       recyclerView.setItemAnimator(new DefaultItemAnimator());
       recyclerView.setAdapter(todoAdapter);

//       checkBox = (CheckBox) view1.findViewById(R.id.checkbox);
//       tvTodo = (TextView) view2.findViewById(R.id.tvTodo);

       return view;
   }

   public void onCreate(@Nullable Bundle savedInstatnceState){
       super.onCreate(savedInstatnceState);
       TodoData();
   }


    private void TodoData(){
       arrayList.add(new ReData("프래그먼트에 리사이클러뷰 띄우기"));
       arrayList.add(new ReData("로그인 / 회원가입 서버 연동하기"));
       arrayList.add(new ReData("마이페이지에 회원정보 띄우기"));
       arrayList.add(new ReData("검색 로직 짜기"));
       arrayList.add(new ReData("서버 연동 공부하기"));
       arrayList.add(new ReData("프로젝트 성공적으로 끝내기"));
       arrayList.add(new ReData("동생 암살"));
       arrayList.add(new ReData("동생 컴퓨터 부시기"));
       arrayList.add(new ReData("에어컨 틀기"));
       arrayList.add(new ReData("공부하기"));
       arrayList.add(new ReData("배틀그라운드 하기"));
       arrayList.add(new ReData("유튜브 보기"));
    }
}