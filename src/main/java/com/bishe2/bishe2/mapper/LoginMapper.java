package com.bishe2.bishe2.mapper;

import com.bishe2.bishe2.pojo.Company;
import com.bishe2.bishe2.pojo.Parent;
import com.bishe2.bishe2.pojo.Student;
import com.bishe2.bishe2.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LoginMapper {
    String find(String username);
    void add(Map<String,Object> addmap);

    Student find_stu(Map<String, Object> map1);
    Teacher find_tea(Map<String, Object> map2);
    Parent find_par(Map<String, Object> map3);
    Company find_com(Map<String, Object> map4);
}
