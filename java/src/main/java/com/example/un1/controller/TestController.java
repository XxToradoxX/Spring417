package com.example.un1.controller;

import com.example.un1.pojo.Article;
import com.example.un1.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Controller
@Slf4j
public class TestController {
    @Autowired
    ArticleService articleService;
    @GetMapping("/hello")
    public String Hello(){
        return "/hello";
    }
    @GetMapping("/ano")
    public String ano(){
        return "/view/ano";
    }
}
