package com.bishe2.bishe2.mapper;

import com.bishe2.bishe2.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Locale;

@Mapper
public interface CategoryMapper {

    @Select("select * from category_ ")
    List<Category> findAll();

}
