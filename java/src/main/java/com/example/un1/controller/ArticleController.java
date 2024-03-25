package com.example.un1.controller;

import com.example.un1.mapper.ArticleMapper;
import com.example.un1.pojo.Article;
import com.example.un1.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@Slf4j
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @GetMapping("/hello")
    public String SelectAll(){
        List<Article> aritileList = articleService.selectAllAll();
        log.info("{}",aritileList);
        return "/hello";
    }
    @GetMapping("/ano")
    public String ano(){
        return "/view/ano";
    }
}
