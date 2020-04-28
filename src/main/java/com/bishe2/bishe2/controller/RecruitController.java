package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.pojo.Recruit;
import com.bishe2.bishe2.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RecruitController {
    @Autowired
    RecruitService recruitService;
    @ResponseBody
    @RequestMapping("/find_recruit")
    public List find_recruit(){
        List<Recruit> recruitList = recruitService.find_recruit();
        return recruitList;
    }
}
