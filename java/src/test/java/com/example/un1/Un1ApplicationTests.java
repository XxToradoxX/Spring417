package com.example.un1;

import com.example.un1.mapper.ArticleMapper;
import com.example.un1.pojo.Ariticle;
import com.example.un1.service.ArticleService;
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
    @Test
    void ttst1() {
        List<Ariticle> aritileList = articleService.selectAll();
        log.info("{}",aritileList);

    }

}
