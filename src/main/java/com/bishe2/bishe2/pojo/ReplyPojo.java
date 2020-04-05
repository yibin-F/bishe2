package com.bishe2.bishe2.pojo;

public class ReplyPojo {
    private int reply_id;
    private int comment_id;
    private int user_id;
    private int user_type;
    private String user_name;
    private String reply_content;

    @Override
    public String toString() {
        return "ReplyPojo{" +
                "reply_id=" + reply_id +
                ", comment_id=" + comment_id +
                ", user_id=" + user_id +
                ", user_type=" + user_type +
                ", user_name='" + user_name + '\'' +
                ", reply_content='" + reply_content + '\'' +
                '}';
    }

    public int getReply_id() {
        return reply_id;
    }

    public void setReply_id(int reply_id) {
        this.reply_id = reply_id;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getReply_content() {
        return reply_content;
    }

    public void setReply_content(String reply_content) {
        this.reply_content = reply_content;
    }
}
