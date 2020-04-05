package com.bishe2.bishe2.pojo;

public class Article {
    private int article_id;
    private int u_id;
    private int user_type;
    private String user_name;
    private String article_time;
    private String article_content;
    private int del_index;

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", u_id=" + u_id +
                ", user_type=" + user_type +
                ", user_name='" + user_name + '\'' +
                ", article_time='" + article_time + '\'' +
                ", article_content='" + article_content + '\'' +
                ", del_index=" + del_index +
                '}';
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
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

    public String getArticle_time() {
        return article_time;
    }

    public void setArticle_time(String article_time) {
        this.article_time = article_time;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }

    public int getDel_index() {
        return del_index;
    }

    public void setDel_index(int del_index) {
        this.del_index = del_index;
    }
}
