package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.pojo.Msg;
import com.bishe2.bishe2.service.ArticleService;
import com.bishe2.bishe2.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class MagController {
    @Autowired
    MsgService msgService;
    //    查找消息联系人
    @ResponseBody
    @RequestMapping("/find_Msguser")
    public List find_Msguser(HttpServletRequest request){
        int user_id= Integer.parseInt(request.getParameter("user_id"));
        int user_type= Integer.parseInt(request.getParameter("user_type"));
        Map<String,Object> map = new HashMap<>();
        map.put("user_id",user_id);
        map.put("user_type",user_type);
        List<Msg> msgList = msgService.find_Msguser(map);
        return msgList;
    }
    //   获取消息内容
    @ResponseBody
    @RequestMapping("/find_Msgcontent")
    public List find_Msgcontent(HttpServletRequest request){
        int from_id= Integer.parseInt(request.getParameter("from_id"));
        int from_type= Integer.parseInt(request.getParameter("from_type"));
        int to_id= Integer.parseInt(request.getParameter("to_id"));
        int to_type= Integer.parseInt(request.getParameter("to_type"));
        Map<String,Object> map = new HashMap<>();
        map.put("from_id",from_id);
        map.put("from_type",from_type);
        map.put("to_id",to_id);
        map.put("to_type",to_type);
        List<Msg> msgList = msgService.find_Msgcontent(map);
        return msgList;
    }
    //新增信息
    @ResponseBody
    @RequestMapping("/add_msg")
    public void add_msg(HttpServletRequest request){
        int from_id= Integer.parseInt(request.getParameter("from_id"));
        int from_type= Integer.parseInt(request.getParameter("from_type"));
        int to_id= Integer.parseInt(request.getParameter("to_id"));
        int to_type= Integer.parseInt(request.getParameter("to_type"));
        String msg_content = request.getParameter("msg_content");
        Map<String,Object> map = new HashMap<>();
        //获取系统当前时间
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date);
        map.put("from_id",from_id);
        map.put("from_type",from_type);
        map.put("to_id",to_id);
        map.put("to_type",to_type);
        map.put("msg_content",msg_content);
        map.put("msg_time",time);
        msgService.add_msg(map);
    }

}
