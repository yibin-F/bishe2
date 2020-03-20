package com.bishe2.bishe2.service;

import com.bishe2.bishe2.mapper.AlterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AlterService {
    @Autowired
    AlterMapper alterMapper;
    public void alter_password1(String password,int uid) {
        Map<String,Object> map1 = new HashMap<>();
        map1.put("password",password);
        map1.put("uid",uid);
        alterMapper.alter_password1(map1);
    }

    public void alter_password2(String password, int uid) {
        Map<String,Object> map2 = new HashMap<>();
        map2.put("password",password);
        map2.put("uid",uid);
        alterMapper.alter_password2(map2);
    }

    public void alter_password3(String password, int uid) {
        Map<String,Object> map3 = new HashMap<>();
        map3.put("password",password);
        map3.put("uid",uid);
        alterMapper.alter_password3(map3);
    }

    public void alter_password4(String password, int uid) {
        Map<String,Object> map4 = new HashMap<>();
        map4.put("password",password);
        map4.put("uid",uid);
        alterMapper.alter_password4(map4);
    }

    public void alter_introduct(String text,int uid) {
        Map<String,Object> map_introduct = new HashMap<>();
        map_introduct.put("text",text);
        map_introduct.put("uid",uid);
        alterMapper.alter_introduct(map_introduct);
    }
}
