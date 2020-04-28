package com.bishe2.bishe2.pojo;

public class Recruit{
    private int recruit_id;
    private int u_id;
    private int recruit_major;
    private String recruit_time;
    private String user_name;
    private String recruit_money;
    private String recruit_content;
    private String recruit_request;
    private String recruit_adress;
    private String recruit_title;

    @Override
    public String toString() {
        return "Recruit{" +
                "recruit_id=" + recruit_id +
                ", u_id=" + u_id +
                ", recruit_major=" + recruit_major +
                ", recruit_time='" + recruit_time + '\'' +
                ", user_name='" + user_name + '\'' +
                ", recruit_money='" + recruit_money + '\'' +
                ", recruit_content='" + recruit_content + '\'' +
                ", recruit_request='" + recruit_request + '\'' +
                ", recruit_adress='" + recruit_adress + '\'' +
                ", recruit_title='" + recruit_title + '\'' +
                '}';
    }

    public int getRecruit_id() {
        return recruit_id;
    }

    public void setRecruit_id(int recruit_id) {
        this.recruit_id = recruit_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getRecruit_major() {
        return recruit_major;
    }

    public void setRecruit_major(int recruit_major) {
        this.recruit_major = recruit_major;
    }

    public String getRecruit_time() {
        return recruit_time;
    }

    public void setRecruit_time(String recruit_time) {
        this.recruit_time = recruit_time;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getRecruit_money() {
        return recruit_money;
    }

    public void setRecruit_money(String recruit_money) {
        this.recruit_money = recruit_money;
    }

    public String getRecruit_content() {
        return recruit_content;
    }

    public void setRecruit_content(String recruit_content) {
        this.recruit_content = recruit_content;
    }

    public String getRecruit_request() {
        return recruit_request;
    }

    public void setRecruit_request(String recruit_request) {
        this.recruit_request = recruit_request;
    }

    public String getRecruit_adress() {
        return recruit_adress;
    }

    public void setRecruit_adress(String recruit_adress) {
        this.recruit_adress = recruit_adress;
    }

    public String getRecruit_title() {
        return recruit_title;
    }

    public void setRecruit_title(String recruit_title) {
        this.recruit_title = recruit_title;
    }
}
