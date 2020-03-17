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
}
