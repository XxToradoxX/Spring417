package com.example.un1;

import com.example.un1.pojo.Article;
import com.example.un1.pojo.Comment;
import com.example.un1.service.ArticleService;
import com.example.un1.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class Un1ApplicationTests {
    @Autowired
    ArticleService articleService;
    @Autowired
    CommentService commentService;
    @Test
    void ttst1() {
        List<Article> aritileList = articleService.selectAllAll();
        log.info("可以得到的结果是:{}",aritileList);
    }
    @Test
    void ttst2() {
        List<Article> aritileList = articleService.selectAll();
        log.info("可以得到的结果是:{}",aritileList);
    }
    @Test
    void ttst3(){
        List<Comment> commentList = commentService.selectAll();
        log.info("{}",commentList);
    }
}
