package com.example.un1.mapper;

import com.example.un1.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> getCommentsByAid(@Param("id") Integer id);
}
