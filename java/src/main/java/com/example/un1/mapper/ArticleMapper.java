package com.example.un1.mapper;

import com.example.un1.pojo.Ariticle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    public List<Ariticle> selectAll();
}