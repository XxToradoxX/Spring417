package com.example.un1.controller;

import com.example.un1.mapper.ArticleMapper;
import com.example.un1.pojo.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ArticleController {
    @Autowired
    ArticleMapper artileMapper;
    @GetMapping("/ttst")
    public String SelectAll(){
//        ArticleMapper artileMapper = sqlSession.getMapper(ArticleMapper.class);
        List<Article> aritileList = artileMapper.selectAll();
        log.info("{}",aritileList);
        return "yees";
    }
}
