package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.pojo.Student;
import com.bishe2.bishe2.service.AlterService;
import com.bishe2.bishe2.service.imgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AlterController {
    @Autowired
    AlterService alterService;
    @Autowired
    imgService imgService;
    @ResponseBody
    @RequestMapping("/alter_password1")
    public void alter_password1(HttpServletRequest request){
        String password = request.getParameter("password");
        int uid = Integer.parseInt(request.getParameter("uid"));
        alterService.alter_password1(password,uid);
    }
    @ResponseBody
    @RequestMapping("/alter_password2")
    public void alter_password2(HttpServletRequest request){
        String password = request.getParameter("password");
        int uid = Integer.parseInt(request.getParameter("uid"));
        alterService.alter_password2(password,uid);
    }

    @ResponseBody
    @RequestMapping("/alter_password3")
    public void alter_password3(HttpServletRequest request){
        String password = request.getParameter("password");
        int uid = Integer.parseInt(request.getParameter("uid"));
        System.out.println("3");
        alterService.alter_password3(password,uid);
    }
    @ResponseBody
    @RequestMapping("/alter_password4")
    public void alter_password4(HttpServletRequest request){
        String password = request.getParameter("password");
        int uid = Integer.parseInt(request.getParameter("uid"));
        alterService.alter_password4(password,uid);
    }

    @ResponseBody
    @RequestMapping("/alter_introduct")
    public void alter_introduct(HttpServletRequest request){
        String text = request.getParameter("text");
        int uid = Integer.parseInt(request.getParameter("uid"));
        alterService.alter_introduct(text,uid);
    }

    @ResponseBody
    @RequestMapping("/alter_img")
    public boolean alter_img(@RequestParam("file") MultipartFile img, HttpServletRequest request){
        int user_type = Integer.parseInt(request.getParameter("user_type"));
        int uid = Integer.parseInt(request.getParameter("uid"));
        String parentPath=request.getServletContext().getRealPath("/imgurl"+"/headimg");//获取项目的上下文的部署位置
        String filename = user_type+"_"+uid+".jpg";
        System.out.println(parentPath+filename);
        boolean abc = imgService.saveImg(parentPath,filename,img);
        return abc;
      //  alterService.alter_img(text,uid);
    }


}
