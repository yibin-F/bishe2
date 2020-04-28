package com.bishe2.bishe2.pojo;

public class Msg {
    private int msg_id;
    private int from_id;
    private int to_id;
    private int from_type;
    private int to_type;
    private String from_name;
    private String to_name;
    private String msg_time;
    private String msg_content;
    private int del_index;

    public String getFrom_name() {
        return from_name;
    }

    public void setFrom_name(String from_name) {
        this.from_name = from_name;
    }

    public String getTo_name() {
        return to_name;
    }

    public void setTo_name(String to_name) {
        this.to_name = to_name;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg_id=" + msg_id +
                ", from_id=" + from_id +
                ", to_id=" + to_id +
                ", from_type=" + from_type +
                ", to_type=" + to_type +
                ", msg_time='" + msg_time + '\'' +
                ", msg_content='" + msg_content + '\'' +
                ", del_index=" + del_index +
                '}';
    }

    public int getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(int msg_id) {
        this.msg_id = msg_id;
    }

    public int getFrom_id() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public int getTo_id() {
        return to_id;
    }

    public void setTo_id(int to_id) {
        this.to_id = to_id;
    }

    public int getFrom_type() {
        return from_type;
    }

    public void setFrom_type(int from_type) {
        this.from_type = from_type;
    }

    public int getTo_type() {
        return to_type;
    }

    public void setTo_type(int to_type) {
        this.to_type = to_type;
    }

    public String getMsg_time() {
        return msg_time;
    }

    public void setMsg_time(String msg_time) {
        this.msg_time = msg_time;
    }

    public String getMsg_content() {
        return msg_content;
    }

    public void setMsg_content(String msg_content) {
        this.msg_content = msg_content;
    }

    public int getDel_index() {
        return del_index;
    }

    public void setDel_index(int del_index) {
        this.del_index = del_index;
    }
}
