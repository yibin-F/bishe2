package com.bishe2.bishe2.service;

import com.bishe2.bishe2.mapper.AlterMapper;
import com.bishe2.bishe2.mapper.ArticleMapper;
import com.bishe2.bishe2.mapper.FindUserMapper;
import com.bishe2.bishe2.mapper.ShenheMapper;
import com.bishe2.bishe2.pojo.Article;
import com.bishe2.bishe2.pojo.CommentPojo;
import com.bishe2.bishe2.pojo.ReplyPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    FindUserMapper findUserMapper;
    public List<Article> find_article() {
        List<Article> articleList = articleMapper.find_article();
        for (int i=0;i<articleList.size();i++){
            if(articleList.get(i).getUser_type()==1)
            {
                articleList.get(i).setUser_name(findUserMapper.find_stuname(articleList.get(i).getU_id()));
            }else if (articleList.get(i).getUser_type()==2){
                articleList.get(i).setUser_name(findUserMapper.find_teaname(articleList.get(i).getU_id()));
            }else if (articleList.get(i).getUser_type()==3){
                articleList.get(i).setUser_name(findUserMapper.find_parname(articleList.get(i).getU_id()));
            }else if (articleList.get(i).getUser_type()==4){
                articleList.get(i).setUser_name(findUserMapper.find_comname(articleList.get(i).getU_id()));
            }

        }
        return articleList;
    }
//查找评论列表
    public List<CommentPojo> find_commentlist(int article_id) {
        List<CommentPojo> commentList = articleMapper.find_commentList(article_id);
        for (int i=0;i<commentList.size();i++){
            if(commentList.get(i).getUser_type()==1)
            {
                commentList.get(i).setUser_name(findUserMapper.find_stuname(commentList.get(i).getUser_id()));
            }else if (commentList.get(i).getUser_type()==2){
                commentList.get(i).setUser_name(findUserMapper.find_teaname(commentList.get(i).getUser_id()));
            }else if (commentList.get(i).getUser_type()==3){
                commentList.get(i).setUser_name(findUserMapper.find_parname(commentList.get(i).getUser_id()));
            }else if (commentList.get(i).getUser_type()==4){
                commentList.get(i).setUser_name(findUserMapper.find_comname(commentList.get(i).getUser_id()));
            }
        }
        for (int i=0;i<commentList.size();i++){
            commentList.get(i).setReplyPojoList(articleMapper.find_replyList(commentList.get(i).getComment_id()));
            for (int j =0;j<commentList.get(i).getReplyPojoList().size();j++)
            {
                if (commentList.get(i).getReplyPojoList().get(j).getUser_type()==1){
                    commentList.get(i).getReplyPojoList().get(j).setUser_name(findUserMapper.find_stuname(commentList.get(i).getReplyPojoList().get(j).getUser_id()));
                }else if (commentList.get(i).getReplyPojoList().get(j).getUser_type()==2){
                    commentList.get(i).getReplyPojoList().get(j).setUser_name(findUserMapper.find_teaname(commentList.get(i).getReplyPojoList().get(j).getUser_id()));
                }else if (commentList.get(i).getReplyPojoList().get(j).getUser_type()==3){
                    commentList.get(i).getReplyPojoList().get(j).setUser_name(findUserMapper.find_parname(commentList.get(i).getReplyPojoList().get(j).getUser_id()));
                }else if (commentList.get(i).getReplyPojoList().get(j).getUser_type()==4){
                    commentList.get(i).getReplyPojoList().get(j).setUser_name(findUserMapper.find_comname(commentList.get(i).getReplyPojoList().get(j).getUser_id()));
                }
            }
        }
        return commentList;
    }

    public List<ReplyPojo> find_replylist(int comment_id) {
        List<ReplyPojo> replyList = articleMapper.find_replyList(comment_id);
        for (int i=0;i<replyList.size();i++){
            if(replyList.get(i).getUser_type()==1)
            {
                replyList.get(i).setUser_name(findUserMapper.find_stuname(replyList.get(i).getUser_id()));
            }else if (replyList.get(i).getUser_type()==2){
                replyList.get(i).setUser_name(findUserMapper.find_teaname(replyList.get(i).getUser_id()));
            }else if (replyList.get(i).getUser_type()==3){
                replyList.get(i).setUser_name(findUserMapper.find_parname(replyList.get(i).getUser_id()));
            }else if (replyList.get(i).getUser_type()==4){
                replyList.get(i).setUser_name(findUserMapper.find_comname(replyList.get(i).getUser_id()));
            }
        }
        return replyList;
    }

    public void add_comment(CommentPojo comment) {

        articleMapper.add_comment(comment);
    }

    public void add_reply(ReplyPojo replyPojo) {
        articleMapper.add_reply(replyPojo);
    }
}
