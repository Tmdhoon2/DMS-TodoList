package com.tmdhoon.todolist.Recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tmdhoon.todolist.R;
import com.tmdhoon.todolist.databinding.TodolistRecyclerviewBinding;

import java.util.ArrayList;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder>{

    private ArrayList<ReData> arrayList;

    public class TodoViewHolder extends RecyclerView.ViewHolder {

        public TextView contents;
        public TextView title;
        public TextView created_at;
        public TextView member_id;

        public TodoViewHolder(View view) {
            super(view);
            contents = view.findViewById(R.id.tvcontents);
            title = view.findViewById(R.id.tvtitle);
            created_at = view.findViewById(R.id.tvcreated_at);
            member_id = view.findViewById(R.id.tvmember_id);
        }
    }

    public TodoAdapter(ArrayList<ReData> arrayList){
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public TodoAdapter.TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.todolist_recyclerview, parent, false);

        return new TodoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.TodoViewHolder holder, int position) {

        holder.contents.setText(arrayList.get(position).getContents());
        holder.title.setText(arrayList.get(position).getTitle());
        holder.created_at.setText(arrayList.get(position).getCreated_at());
        holder.member_id.setText(arrayList.get(position).getMember_id());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
