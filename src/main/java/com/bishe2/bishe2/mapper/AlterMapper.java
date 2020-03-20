package com.bishe2.bishe2.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface AlterMapper {
    void alter_password1(Map<String,Object> map);
    void alter_password2(Map<String, Object> map1);
    void alter_password3(Map<String, Object> map2);
    void alter_password4(Map<String, Object> map3);

    void alter_introduct(Map<String,Object> map4);
}
