package com.example.un1.controller;

import com.example.un1.pojo.Article;
import com.example.un1.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Slf4j
public class TestController {
    @Autowired
    ArticleService articleService;
    @GetMapping("/hello")
    public ModelAndView Hello(){
        String h1 = "<h1>我的天哪</h1>";
        String zbc = "真不戳啊";
        Article article = articleService.selectAllAll().get(0);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("zbc",zbc);
        modelAndView.addObject("article",article);
        modelAndView.addObject("h1",h1);
        modelAndView.setViewName("hello");
        return modelAndView;
    }
    @GetMapping("/ano")
    public String ano(Model model){
        String zbc = "真不戳啊";
        model.addAttribute("zbc",zbc);
        return "/view/ano";
    }
}
