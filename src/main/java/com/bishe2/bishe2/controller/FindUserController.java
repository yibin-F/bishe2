package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.pojo.Chengji;
import com.bishe2.bishe2.pojo.Company;
import com.bishe2.bishe2.pojo.Student;
import com.bishe2.bishe2.pojo.Teacher;
import com.bishe2.bishe2.service.FindUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FindUserController {
    @Autowired
    FindUserService findUserService;
    @ResponseBody
    @RequestMapping("/findStudentlist")
    public List findStudent(HttpServletRequest request){
        int class_id = Integer.parseInt(request.getParameter("class_id"));
        int grade_id = Integer.parseInt(request.getParameter("grade_id"));
        int major_id = Integer.parseInt(request.getParameter("major_id"));


        List<Student> studentlist = findUserService.findStudentList(class_id,grade_id,major_id);
        return studentlist;

    }
    @ResponseBody
    @RequestMapping("/findTeacherlist")
    public List findTeacher(HttpServletRequest request){
        List<Teacher> teacherList = findUserService.findTeacherList();
        return teacherList;
    }
    @ResponseBody
    @RequestMapping("/findCompanylist")
    public List findCompany(HttpServletRequest request){
        List<Company> companyList = findUserService.findCompanyList();
        return companyList;
    }

    @ResponseBody
    @RequestMapping("/findCjlist")
    public List findCj(HttpServletRequest request){
        int uid = Integer.parseInt(request.getParameter("u_id"));
        List<Chengji> chengjiList = findUserService.findCjList(uid);
        System.out.println(chengjiList.toString());
        return chengjiList;
    }
}
