package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.mapper.CategoryMapper;
import com.bishe2.bishe2.mapper.LoginMapper;
import com.bishe2.bishe2.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;
    @ResponseBody
    @RequestMapping("/login")
    public String Login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String index = loginService.login(username,password);

//        Map<String,Object> addmap = new HashMap<>();
//        addmap.put("id","555");
//        addmap.put("password","555");
//        loginMapper.add(addmap);
        return index;
    }
}
