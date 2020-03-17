package com.bishe2.bishe2.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface AlterMapper {
    void alter_password1(Map<String,Object> map);
}
