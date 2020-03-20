package com.bishe2.bishe2.mapper;

import com.bishe2.bishe2.pojo.Chengji;
import com.bishe2.bishe2.pojo.Company;
import com.bishe2.bishe2.pojo.Teacher;
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
}
