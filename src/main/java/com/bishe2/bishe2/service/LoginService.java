package com.bishe2.bishe2.service;

import com.bishe2.bishe2.mapper.LoginMapper;
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
}
