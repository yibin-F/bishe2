package com.bishe2.bishe2.controller.adminbackend;

import com.bishe2.bishe2.http.response.LayuiResponse;
import com.bishe2.bishe2.http.response.company.CompanyResponse;
import com.bishe2.bishe2.http.response.student.StudentResponse;
import com.bishe2.bishe2.pojo.Company;
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
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    FindUserService findUserService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CompanyResponse list(@RequestParam Integer limit, @RequestParam Integer page) {
        CompanyResponse response = new CompanyResponse();
        response.setMsg("请求成功");
        response.setCode(LayuiResponse.SUCCESS_CODE);
        response.setCount(100);
        int a = limit*(page-1);
        int b = limit*page;
        List<Company> companyList = findUserService.CompanyList(a,b);
        response.setData(companyList);
        return response;
    }
}
