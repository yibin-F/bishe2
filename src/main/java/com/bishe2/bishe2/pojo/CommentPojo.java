package com.bishe2.bishe2.pojo;

import java.util.List;

public class CommentPojo {
    private int comment_id;
    private int article_id;
    private int user_id;
    private int user_type;
    private String user_name;
    private String comment_time;
    private String comment_content;
    private List<ReplyPojo> replyPojoList;

    @Override
    public String toString() {
        return "CommentPojo{" +
                "comment_id=" + comment_id +
                ", article_id=" + article_id +
                ", user_id=" + user_id +
                ", user_type=" + user_type +
                ", user_name='" + user_name + '\'' +
                ", comment_time='" + comment_time + '\'' +
                ", comment_content='" + comment_content + '\'' +
                ", replyPojoList=" + replyPojoList +
                '}';
    }

    public List<ReplyPojo> getReplyPojoList() {
        return replyPojoList;
    }

    public void setReplyPojoList(List<ReplyPojo> replyPojoList) {
        this.replyPojoList = replyPojoList;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
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

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }
}
