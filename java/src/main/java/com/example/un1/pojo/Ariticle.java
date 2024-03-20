package com.example.un1.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Ariticle {
    private Integer id;
    private String title;
    private String content;
    private List<Comment> commentList;
}
