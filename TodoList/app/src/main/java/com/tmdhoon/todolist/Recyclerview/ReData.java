package com.tmdhoon.todolist.Recyclerview;

public class ReData {

    private String contents;
    private String title;
    private String created_at;
    private String member_id;

    public ReData(String contents, String title, String created_at, String member_id) {
        this.contents = contents;
        this.title = title;
        this.created_at = created_at;
        this.member_id = member_id;
    }

    public String getContents() {
        return contents;
    }

    public String getTitle() {
        return title;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getMember_id() {
        return member_id;
    }
}
