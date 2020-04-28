package com.bishe2.bishe2.service;

import com.bishe2.bishe2.mapper.FindUserMapper;
import com.bishe2.bishe2.mapper.LoginMapper;
import com.bishe2.bishe2.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class FindUserService {
    @Autowired
    FindUserMapper findUserMapper;
    public List findStudentList(int class_id,int grade_id,int major_id) {
        Map<String,Object> map1 = new HashMap();
        map1.put("class_id",class_id);
        map1.put("grade_id",grade_id);
        map1.put("major_id",major_id);
        List<Student> studentlist = findUserMapper.findStudentList(map1);
        //获取到专业，访问数据库查找专业名
        for(int i=0;i<studentlist.size();i++){
            studentlist.get(i).setMajor_name(findUserMapper.find_usermajor(studentlist.get(i).getMajor_id()));
        }
        return studentlist;
    }

    public List<Teacher> findTeacherList() {
        List<Teacher> teacherList = findUserMapper.findTeacherList();
        return teacherList;
    }

    public List<Company> findCompanyList() {
        List<Company> companyList = findUserMapper.findCompanyList();
        return companyList;
    }

    public List<Chengji> findCjList(int uid) {
        List<Chengji> chengjiList = findUserMapper.findCjList(uid);
        if (chengjiList!=null){
            for (int i =0;i<chengjiList.size();i++){
                int course_id = chengjiList.get(i).getCourse_id();
                String course_name = findUserMapper.findCourse(course_id);
                chengjiList.get(i).setCourse_name(course_name);
            }
        }
        return chengjiList;
    }
    //后台
    //获取学生用户信息
    public List<Student> StudentList(int limit,int page){
        Map<String,Object> map = new HashMap<>();
        map.put("limits",limit);
        map.put("pages",page);
        List<Student> studentList = findUserMapper.studentlist(map);
        return studentList;
    }
    //获取教师用户信息
    public List<Teacher> TeacherList(int a, int b) {
        Map<String,Object> map = new HashMap<>();
        map.put("limits",a);
        map.put("pages",b);
        List<Teacher> teacherList = findUserMapper.teacherlist(map);
        return teacherList;
    }
    //获取家长用户信息
    public List<Parent> ParentList(int a, int b) {
        Map<String,Object> map = new HashMap<>();
        map.put("limits",a);
        map.put("pages",b);
        List<Parent> parentList = findUserMapper.parentlist(map);
        return parentList;
    }
    //获取企业用户信息
    public List<Company> CompanyList(int a, int b) {
        Map<String,Object> map = new HashMap<>();
        map.put("limits",a);
        map.put("pages",b);
        List<Company> companyList = findUserMapper.companylist(map);
        return companyList;
    }
}
