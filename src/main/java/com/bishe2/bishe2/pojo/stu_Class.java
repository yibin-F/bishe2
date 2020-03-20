package com.bishe2.bishe2.pojo;

public class stu_Class {
    private int class_id;
    private int class_num;
    private int major_id;
    private int grade_id;

    @Override
    public String toString() {
        return "stu_Class{" +
                "class_id=" + class_id +
                ", class_num=" + class_num +
                ", major_id=" + major_id +
                ", grade_id=" + grade_id +
                '}';
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getClass_num() {
        return class_num;
    }

    public void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }
}
