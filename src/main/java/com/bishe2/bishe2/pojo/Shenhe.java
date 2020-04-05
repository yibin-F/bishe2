package com.bishe2.bishe2.pojo;

public class Shenhe {
    private int shenhe_id;
    private String shenhe_title;
    private int student_id;
    private String student_name;
    private String shenhe_img;
    private int teacher_id;
    private String teacher_name;
    private String shengqing_time;
    private String shenhe_time;
    private String reply;
    private int shenhe_index;

    @Override
    public String toString() {
        return "Shenhe{" +
                "shenhe_id=" + shenhe_id +
                ", shenhe_title='" + shenhe_title + '\'' +
                ", student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", shenhe_img='" + shenhe_img + '\'' +
                ", teacher_id=" + teacher_id +
                ", teacher_name='" + teacher_name + '\'' +
                ", shengqing_time='" + shengqing_time + '\'' +
                ", shenhe_time='" + shenhe_time + '\'' +
                ", reply='" + reply + '\'' +
                ", shenhe_index=" + shenhe_index +
                '}';
    }

    public int getShenhe_id() {
        return shenhe_id;
    }

    public void setShenhe_id(int shenhe_id) {
        this.shenhe_id = shenhe_id;
    }

    public String getShenhe_title() {
        return shenhe_title;
    }

    public void setShenhe_title(String shenhe_title) {
        this.shenhe_title = shenhe_title;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getShenhe_img() {
        return shenhe_img;
    }

    public void setShenhe_img(String shenhe_img) {
        this.shenhe_img = shenhe_img;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getShengqing_time() {
        return shengqing_time;
    }

    public void setShengqing_time(String shengqing_time) {
        this.shengqing_time = shengqing_time;
    }

    public String getShenhe_time() {
        return shenhe_time;
    }

    public void setShenhe_time(String shenhe_time) {
        this.shenhe_time = shenhe_time;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public int getShenhe_index() {
        return shenhe_index;
    }

    public void setShenhe_index(int shenhe_index) {
        this.shenhe_index = shenhe_index;
    }
}
