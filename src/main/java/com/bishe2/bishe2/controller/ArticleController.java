package com.bishe2.bishe2.controller;

import com.bishe2.bishe2.pojo.Article;
import com.bishe2.bishe2.pojo.CommentPojo;
import com.bishe2.bishe2.pojo.ReplyPojo;
import com.bishe2.bishe2.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;
//    查找文章
    @ResponseBody
    @RequestMapping("/find_article")
    public List find_article(){
        List<Article> articleList = articleService.find_article();
        return articleList;
    }
//  查找评论列表
    @ResponseBody
    @RequestMapping("/find_commentlist")
    public List find_commentlist(HttpServletRequest request){
        int article_id = Integer.parseInt(request.getParameter("article_id"));
        List<CommentPojo> commentlistList = articleService.find_commentlist(article_id);
        return commentlistList;
    }
//    查找回复列表
    @ResponseBody
    @RequestMapping("/find_replylist")
    public List find_replylist(HttpServletRequest request){
        int comment_id = Integer.parseInt(request.getParameter("comment_id"));
        List<ReplyPojo> replyList = articleService.find_replylist(comment_id);
        return replyList;
    }
//    添加评论
@ResponseBody
@RequestMapping("/add_comment")
public void add_comment(HttpServletRequest request){
    int article_id = Integer.parseInt(request.getParameter("article_id"));
    int user_id = Integer.parseInt(request.getParameter("user_id"));
    int user_type= Integer.parseInt(request.getParameter("user_type"));
    String comment_content=request.getParameter("comment_content");
    CommentPojo comment = new CommentPojo();
    comment.setArticle_id(article_id);
    comment.setUser_id(user_id);
    comment.setUser_type(user_type);
    comment.setComment_content(comment_content);
    //获取系统当前时间
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String time = format.format(date);
    comment.setComment_time(time);
    articleService.add_comment(comment);

}
//添加回复
@ResponseBody
@RequestMapping("/add_reply")
public void add_reply(HttpServletRequest request){
    int comment_id = Integer.parseInt(request.getParameter("comment_id"));
    int user_id = Integer.parseInt(request.getParameter("user_id"));
    int user_type= Integer.parseInt(request.getParameter("user_type"));
    String reply_content=request.getParameter("reply_content");
    ReplyPojo replyPojo = new ReplyPojo();
    replyPojo.setComment_id(comment_id);
    replyPojo.setUser_id(user_id);
    replyPojo.setUser_type(user_type);
    replyPojo.setReply_content(reply_content);
    articleService.add_reply(replyPojo);

}

}
