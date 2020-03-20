package com.bishe2.bishe2.service;

import com.bishe2.bishe2.mapper.LoginMapper;
import com.bishe2.bishe2.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {
    @Autowired
    LoginMapper loginMapper;
    String index = "1";
    public String login(String username, String password) {
        System.out.println(username);
        String findpassword = loginMapper.find(username);
        if(findpassword.equals(password)){
            index="1";
        }else {
            index="2";
        }
        return index;
//
//        Map<String,Object> addmap = new HashMap<>();
//        addmap.put("id","333");
//        addmap.put("password","333");
//        loginMapper.add(addmap);
//        return index;
    }

    public Student stu_login(String username, String password) {
        Map<String,Object> map1 = new HashMap<>();
        map1.put("username",username);
        map1.put("password",password);
        Student student = loginMapper.find_stu(map1);
        //获取到专业，访问数据库查找专业名
        student.setMajor_name(loginMapper.find_major(student).getMajor_name());
        System.out.println(student.getMajor_name());
        return student;
    }
    public Teacher tea_login(String username, String password) {
        Map<String,Object> map2 = new HashMap<>();
        map2.put("username",username);
        map2.put("password",password);
        Teacher teacher = loginMapper.find_tea(map2);
        return teacher;
    }
    public Parent par_login(String username, String password) {
        Map<String,Object> map3 = new HashMap<>();
        map3.put("username",username);
        map3.put("password",password);
        Parent parent = loginMapper.find_par(map3);
        return parent;
    }
    public Company com_login(String username, String password) {
        Map<String,Object> map4 = new HashMap<>();
        map4.put("username",username);
        map4.put("password",password);
        Company company = loginMapper.find_com(map4);
        return company;
    }
}
