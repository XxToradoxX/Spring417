package com.example.un1.service.impl;

import com.example.un1.mapper.ArticleMapper;
import com.example.un1.mapper.CommentMapper;
import com.example.un1.pojo.Ariticle;
import com.example.un1.pojo.Comment;
import com.example.un1.service.ArticleService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    CommentMapper commentMapper;
    @Override
    public List<Ariticle> selectAll() {
        List<Ariticle> ariticleList = articleMapper.selectAll();
        for(var it:ariticleList){
            it.setCommentList(commentMapper.getCommentsByAid(it.getId()));
        }
        return ariticleList;
    }
}
