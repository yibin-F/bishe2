package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.pojo.Shenhe;
import com.bishe2.bishe2.service.ShenheService;
import com.bishe2.bishe2.service.imgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class ShenheController {
    @Autowired
    ShenheService shenheService;
    @Autowired
    com.bishe2.bishe2.service.imgService imgService;

    //    上传证书
    @ResponseBody
    @RequestMapping("/shenhe_add")
    public Shenhe shenhe_add(HttpServletRequest request) {
        Map<String, Object> map1 = new HashMap<>();
        int uid = Integer.parseInt(request.getParameter("uid"));
        String title = request.getParameter("title");
        //获取系统当前时间
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date);

        map1.put("uid", uid);
        map1.put("title", title);
     //   map1.put("img_url", img_url);
        map1.put("shengqing_time", time);
        System.out.println(map1.toString());
        shenheService.add(map1);
        //查找审核id
        Shenhe shenhe = shenheService.find_shenhe_id(map1);
        System.out.println(shenhe.toString());
        return shenhe;
    }

    // 老师查找未审核的
    @ResponseBody
    @RequestMapping("/find_shenheing")
    public List find_shenheing(){
        List<Shenhe> shenheingList = shenheService.find_shenheing();
        return shenheingList;
    }
    // 老师查找以审核的
    @ResponseBody
    @RequestMapping("/find_shenhed")
    public List find_shenhed(){
        List<Shenhe> shenhedList = shenheService.find_shenhed();
        return shenhedList;
    }
    //学生查找未审核的
    @ResponseBody
    @RequestMapping("/find_stu_shenheing")
    public List find_stu_shenheing(HttpServletRequest request){
        int uid = Integer.parseInt(request.getParameter("uid"));
        List<Shenhe> shenheingList = shenheService.find_stu_shenheing(uid);
        return shenheingList;
    }
    // 学生以审核的
    @ResponseBody
    @RequestMapping("/find_stu_shenhed")
    public List find_stu_shenhed(HttpServletRequest request){
        int uid = Integer.parseInt(request.getParameter("uid"));
        List<Shenhe> shenhedList = shenheService.find_stu_shenhed(uid);
        return shenhedList;
    }
    //审核结果
    @ResponseBody
    @RequestMapping("/shenhe")
    public void shenhe(HttpServletRequest request){
        int shenhe_id = Integer.parseInt(request.getParameter("shenhe_id"));
        int shenhe_index = Integer.parseInt(request.getParameter("shenhe_index"));
        String reply = request.getParameter("reply");
        //获取系统当前时间
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("shenhe_id",shenhe_id);
        map1.put("shenhe_index",shenhe_index);
        map1.put("reply",reply);
        map1.put("shenhe_time",time);

        shenheService.alter(map1);
    }
    //查找用户证书
    @ResponseBody
    @RequestMapping("/findZslist")
    public List findZs(HttpServletRequest request){
        int uid = Integer.parseInt(request.getParameter("u_id"));
        System.out.println(uid);
        List<Shenhe> zsList = shenheService.findZsList(uid);
        return zsList;
    }
    //上传审核图片
    @ResponseBody
    @RequestMapping("/up_shenheimg")
    public boolean up_shenheimg(@RequestParam("file") MultipartFile img, HttpServletRequest request){
        int shenhe_id = Integer.parseInt(request.getParameter("shenhe_id"));
        String parentPath=request.getServletContext().getRealPath("/imgurl"+"/shenheimg");//获取项目的上下文的部署位置
        String filename = shenhe_id+".jpg";
        System.out.println(parentPath+filename);
        boolean abc = imgService.saveImg(parentPath,filename,img);
        return abc;
        //  alterService.alter_img(text,uid);
    }
    //查找审核内容的图片
    @ResponseBody
    @RequestMapping("/find_shenheimg")
    public String find_shenheimg(HttpServletRequest request) {
        int shenhe_id = Integer.parseInt(request.getParameter("shenhe_id"));
        File imgurl = new File(request.getServletContext().getRealPath("/imgurl" + "/shenheimg") + "/" +shenhe_id+".jpg");
        if (imgurl.exists()) {
            try {
                FileInputStream inputStream = new FileInputStream(imgurl);
                byte[] data = new byte[(int)imgurl.length()];
                inputStream.read(data);
                return new String(Base64.getEncoder().encode(data));//把文件转换为64编码格式
            }
            catch (Exception e){
                return "0";
            }
        } else {
            return "0";
        }
    }
}
