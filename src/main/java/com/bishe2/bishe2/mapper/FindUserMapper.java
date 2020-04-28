package com.bishe2.bishe2.mapper;

import com.bishe2.bishe2.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface FindUserMapper {
    List findStudentList(Map<String, Object> map1);

    List<Teacher> findTeacherList();

    List<Company> findCompanyList();

    List<Chengji> findCjList(int uid);
    String findCourse(int course_id);
    String find_usermajor(int major_id);

    String find_stuname(int uid);
    String find_teaname(int uid);
    String find_parname(int uid);
    String find_comname(int uid);
    //后台
    List<Student> studentlist(Map<String, Object> map1);

    List<Teacher> teacherlist(Map<String, Object> map);

    List<Parent> parentlist(Map<String, Object> map);

    List<Company> companylist(Map<String, Object> map);
}
