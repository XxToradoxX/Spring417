package com.example.un1.service.impl;

import com.example.un1.mapper.ArticleMapper;
import com.example.un1.pojo.Article;
import com.example.un1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> selectAll() {
        return articleMapper.selectAllAll();
    }
}
