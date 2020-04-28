package com.bishe2.bishe2.controller.adminbackend;

import com.bishe2.bishe2.http.response.LayuiResponse;
import com.bishe2.bishe2.http.response.parent.ParentResponse;
import com.bishe2.bishe2.http.response.student.StudentResponse;
import com.bishe2.bishe2.pojo.Parent;
import com.bishe2.bishe2.pojo.Student;
import com.bishe2.bishe2.service.FindUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/parent")
public class ParentController {
    @Autowired
    FindUserService findUserService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public ParentResponse list(@RequestParam Integer limit, @RequestParam Integer page) {
        ParentResponse response = new ParentResponse();
        response.setMsg("请求成功");
        response.setCode(LayuiResponse.SUCCESS_CODE);
        response.setCount(100);
        int a = limit*(page-1);
        int b = limit*page;
        List<Parent> parentList = findUserService.ParentList(a,b);
        response.setData(parentList);
        return response;
    }
}
