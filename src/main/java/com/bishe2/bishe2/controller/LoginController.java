package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.mapper.CategoryMapper;
import com.bishe2.bishe2.mapper.LoginMapper;
import com.bishe2.bishe2.pojo.Company;
import com.bishe2.bishe2.pojo.Parent;
import com.bishe2.bishe2.pojo.Student;
import com.bishe2.bishe2.pojo.Teacher;
import com.bishe2.bishe2.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping("/studentlogin")
    public Student sudentLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Student student = loginService.stu_login(username,password);
        if (student!=null)
        System.out.println(student.toString());
//        Map<String,Object> addmap = new HashMap<>();
//        addmap.put("id","555");
//        addmap.put("password","555");
//        loginMapper.add(addmap);
        return student;
    }
    @ResponseBody
    @RequestMapping("/teacherlogin")
    public Teacher teacherLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Teacher teacher = loginService.tea_login(username,password);
        System.out.println(teacher.toString());
        return teacher;
    }
    @ResponseBody
    @RequestMapping("/parentlogin")
    public Parent parentLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Parent parent = loginService.par_login(username,password);
        return parent;
    }
    @ResponseBody
    @RequestMapping("/companylogin")
    public Company companyLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Company company = loginService.com_login(username,password);
        return company;
    }

}
