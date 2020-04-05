package com.bishe2.bishe2.mapper;

import com.bishe2.bishe2.pojo.Article;
import com.bishe2.bishe2.pojo.CommentPojo;
import com.bishe2.bishe2.pojo.ReplyPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<Article> find_article();

    List<CommentPojo> find_commentList(int article_id);

    List<ReplyPojo> find_replyList(int comment_id);

    void add_comment(CommentPojo comment);

    void add_reply(ReplyPojo replyPojo);
}
