package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.pojo.Chengji;
import com.bishe2.bishe2.pojo.Company;
import com.bishe2.bishe2.pojo.Student;
import com.bishe2.bishe2.pojo.Teacher;
import com.bishe2.bishe2.service.FindUserService;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

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
    //查找文章的图像
    @ResponseBody
    @RequestMapping("/find_articleimg")
    public String find_articleimg(HttpServletRequest request) {
        int article_id = Integer.parseInt(request.getParameter("article_id"));
        File imgurl = new File(request.getServletContext().getRealPath("/imgurl" + "/articleimg") + "/" + article_id + ".jpg");
        if (imgurl.exists()) {
            try {
                FileInputStream inputStream = new FileInputStream(imgurl);
                byte[] data = new byte[(int)imgurl.length()];
                inputStream.read(data);
                return new String(Base64.getEncoder().encode(data));//把文件转换为64编码格式
            }
            catch (Exception e){
                return "0";
            }
        } else {
            return "0";
        }
    }

    //查找用户的个人头像
    @ResponseBody
    @RequestMapping("/find_userimg")
    public String find_userimg(HttpServletRequest request) {
        int uid = Integer.parseInt(request.getParameter("uid"));
        int user_type = Integer.parseInt(request.getParameter("user_type"));

        File imgurl = new File(request.getServletContext().getRealPath("/imgurl" + "/headimg") + "/" + user_type + "_" + uid + ".jpg");
        if (imgurl.exists()) {
            try {
                FileInputStream inputStream = new FileInputStream(imgurl);
                byte[] data = new byte[(int)imgurl.length()];
                inputStream.read(data);
                return new String(Base64.getEncoder().encode(data));//把文件转换为64编码格式
            }
            catch (Exception e){
                return "0";
            }
        } else {
            return "0";
        }
    }

}
