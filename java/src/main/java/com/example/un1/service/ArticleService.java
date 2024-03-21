package com.example.un1.service;

import com.example.un1.pojo.Ariticle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {

    List<Ariticle> selectAll();
}
