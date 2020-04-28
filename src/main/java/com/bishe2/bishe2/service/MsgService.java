package com.bishe2.bishe2.service;

import com.bishe2.bishe2.mapper.FindUserMapper;
import com.bishe2.bishe2.mapper.MsgMapper;
import com.bishe2.bishe2.pojo.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MsgService {
    @Autowired
    MsgMapper msgMapper;
    @Autowired
    FindUserMapper findUserMapper;
    public List find_Msguser(Map<String,Object> map){
        List<Msg> msgList = msgMapper.find_Msguser(map);
        for (int i=0;i<msgList.size();i++) {
            if (msgList.get(i).getFrom_type() == 1) {
                msgList.get(i).setFrom_name(findUserMapper.find_stuname(msgList.get(i).getFrom_id()));
            } else if (msgList.get(i).getFrom_type() == 2) {
                msgList.get(i).setFrom_name(findUserMapper.find_teaname(msgList.get(i).getFrom_id()));
            } else if (msgList.get(i).getFrom_type() == 3) {
                msgList.get(i).setFrom_name(findUserMapper.find_parname(msgList.get(i).getFrom_id()));
            } else if (msgList.get(i).getFrom_type() == 4) {
                msgList.get(i).setFrom_name(findUserMapper.find_comname(msgList.get(i).getFrom_id()));
            }
        }
        for (int i=0;i<msgList.size();i++) {
            if (msgList.get(i).getTo_type() == 1) {
                msgList.get(i).setTo_name(findUserMapper.find_stuname(msgList.get(i).getTo_id()));
            } else if (msgList.get(i).getTo_type() == 2) {
                msgList.get(i).setTo_name(findUserMapper.find_teaname(msgList.get(i).getTo_id()));
            } else if (msgList.get(i).getTo_type() == 3) {
                msgList.get(i).setTo_name(findUserMapper.find_parname(msgList.get(i).getTo_id()));
            } else if (msgList.get(i).getTo_type() == 4) {
                msgList.get(i).setTo_name(findUserMapper.find_comname(msgList.get(i).getTo_id()));
            }
        }
        return msgList;
    }

    public List find_Msgcontent(Map<String, Object> map) {
        List<Msg> msgcontentList = msgMapper.find_Msgcontent(map);
        return msgcontentList;
    }

    public void add_msg(Map<String, Object> map) {
        msgMapper.add_msg(map);
    }
}
