package com.example.un1.mapper;

import com.example.un1.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> getCommentsByAid(@Param("id") Integer id);
    @Select("select * from t_comment")
    List<Comment> selectAll();
}
