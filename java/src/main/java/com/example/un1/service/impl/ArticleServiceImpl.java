package com.example.un1.service.impl;

import com.example.un1.mapper.ArticleMapper;
import com.example.un1.mapper.CommentMapper;
import com.example.un1.pojo.Article;
import com.example.un1.pojo.Comment;
import com.example.un1.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    CommentMapper commentMapper;
    @Override
    public List<Article> selectAll() {
        List<Article> ariticleList = articleMapper.selectAll();
        for(Article it:ariticleList){
            List<Comment> comments = commentMapper.getCommentsByAid(it.getId());
            it.setCommentList(comments);
        }
        return ariticleList;
    }

    @Override
    public List<Article> selectAllAll() {
        List<Article> ariticleList = articleMapper.selectAllAll();
        return ariticleList;
    }
}
