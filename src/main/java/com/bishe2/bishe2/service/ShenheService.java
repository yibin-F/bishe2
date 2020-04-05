package com.bishe2.bishe2.service;

import com.bishe2.bishe2.mapper.ShenheMapper;
import com.bishe2.bishe2.pojo.Shenhe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShenheService {
    @Autowired
    ShenheMapper shenheMapper;
    public void add(Map<String, Object> map1) {
        shenheMapper.add(map1);
    }

    public List<Shenhe> find_shenheing() {
        List<Shenhe> shenheingList = shenheMapper.find_shenheing();
        for (int i=0;i<shenheingList.size();i++){
            shenheingList.get(i).setStudent_name(shenheMapper.find_student(shenheingList.get(i).getStudent_id()));
        }
        return shenheingList;
    }

    public List<Shenhe> find_shenhed() {
        List<Shenhe> shenhedList = shenheMapper.find_shenhed();
        for (int i=0;i<shenhedList.size();i++){
            shenhedList.get(i).setStudent_name(shenheMapper.find_student(shenhedList.get(i).getStudent_id()));
        }
        return shenhedList;
    }

    public void alter(Map<String, Object> map1) {
        shenheMapper.alter(map1);
    }
//学生查询自己的证书
    public List<Shenhe> find_stu_shenheing(int uid) {
        List<Shenhe> shenheingList = shenheMapper.find_stu_shenheing(uid);
        for (int i=0;i<shenheingList.size();i++){
            shenheingList.get(i).setStudent_name(shenheMapper.find_student(shenheingList.get(i).getStudent_id()));
        }
        return shenheingList;
    }

    public List<Shenhe> find_stu_shenhed(int uid) {
        List<Shenhe> shenhedList = shenheMapper.find_stu_shenhed(uid);
        for (int i=0;i<shenhedList.size();i++){
            shenhedList.get(i).setStudent_name(shenheMapper.find_student(shenhedList.get(i).getStudent_id()));
        }
        return shenhedList;
    }

    public List<Shenhe> findZsList(int uid) {
        List<Shenhe> zsList = shenheMapper.findZs(uid);
        return zsList;
    }

    public Shenhe find_shenhe_id(Map<String, Object> map1) {
        Shenhe shenhe = shenheMapper.find_shenhe_id(map1);
        return shenhe;
    }
}
