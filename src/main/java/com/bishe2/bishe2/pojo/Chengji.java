package com.bishe2.bishe2.pojo;

public class Chengji {
    private int mark_id;
    private int u_id;
    private int course_id;
    private double course_mark;
    private String course_name;

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    @Override
    public String toString() {
        return "Chengji{" +
                "mark_id=" + mark_id +
                ", u_id=" + u_id +
                ", course_id=" + course_id +
                ", course_mark=" + course_mark +
                ", course_name='" + course_name + '\'' +
                '}';
    }

    public int getMark_id() {
        return mark_id;
    }

    public void setMark_id(int mark_id) {
        this.mark_id = mark_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public double getCourse_mark() {
        return course_mark;
    }

    public void setCourse_mark(double course_mark) {
        this.course_mark = course_mark;
    }
}
