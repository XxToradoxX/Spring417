package com.example.un1.mapper;

import com.example.un1.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    public List<Article> selectAll();
    public List<Article> selectAllAll();
}
