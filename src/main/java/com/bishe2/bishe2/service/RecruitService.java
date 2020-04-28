package com.bishe2.bishe2.service;

import com.bishe2.bishe2.mapper.FindUserMapper;
import com.bishe2.bishe2.mapper.RecruitMapper;
import com.bishe2.bishe2.pojo.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitService {
    @Autowired
    RecruitMapper recruitMapper;
    @Autowired
    FindUserMapper findUserMapper;
    public List<Recruit> find_recruit() {
        List<Recruit> recruitList = recruitMapper.find_recruit();
        for (int i=0;i<recruitList.size();i++){
            recruitList.get(i).setUser_name(findUserMapper.find_comname(recruitList.get(i).getU_id()));
        }
        return recruitList;
    }
}
