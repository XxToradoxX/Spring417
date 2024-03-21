package com.example.un1.service.impl;

import com.example.un1.mapper.CommentMapper;
import com.example.un1.pojo.Comment;
import com.example.un1.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<Comment> selectAll() {
        return commentMapper.selectAll();
    }
}
