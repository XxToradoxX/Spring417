package com.example.un1.service;

import com.example.un1.pojo.Article;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {

    List<Article> selectAll();
}
