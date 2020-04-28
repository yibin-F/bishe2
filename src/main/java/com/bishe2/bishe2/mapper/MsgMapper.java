package com.bishe2.bishe2.mapper;

import com.bishe2.bishe2.pojo.Msg;

import java.util.List;
import java.util.Map;

public interface MsgMapper {
    List<Msg> find_Msguser(Map<String,Object> map);

    List<Msg> find_Msgcontent(Map<String, Object> map);

    void add_msg(Map<String, Object> map);
}
