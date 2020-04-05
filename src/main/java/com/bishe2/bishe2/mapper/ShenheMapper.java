package com.bishe2.bishe2.mapper;

import com.bishe2.bishe2.pojo.Shenhe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ShenheMapper {
    void alter(Map<String, Object> map1);
    void add(Map<String, Object> map1);

    List<Shenhe> find_shenheing();
    List<Shenhe> find_shenhed();

    String find_student(int student_id);

    List<Shenhe> find_stu_shenheing(int uid);

    List<Shenhe> find_stu_shenhed(int uid);
//查找用户证书
    List<Shenhe> findZs(int uid);
//查找审核id
    Shenhe find_shenhe_id(Map<String, Object> map1);
}
