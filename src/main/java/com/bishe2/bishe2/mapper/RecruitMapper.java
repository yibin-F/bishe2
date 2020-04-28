package com.bishe2.bishe2.mapper;

import com.bishe2.bishe2.pojo.Recruit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RecruitMapper {
    List<Recruit> find_recruit();
}
