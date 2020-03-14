package com.bishe2.bishe2.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LoginMapper {
    String find(String username);
    void add(Map<String,Object> addmap);
}
