package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.pojo.Student;
import com.bishe2.bishe2.service.AlterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AlterController {
    @Autowired
    AlterService alterService;
    @ResponseBody
    @RequestMapping("/alter_password1")
    public void alter_password1(HttpServletRequest request){
        String password = request.getParameter("password");
        int uid = Integer.parseInt(request.getParameter("uid"));
        alterService.alter_password1(password,uid);
    }
}