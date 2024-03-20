package com.example.un1.pojo;

import lombok.Data;

@Data
public class Comment {
    private Integer id;
    private String content;
    private String author;
    private Integer aId;
}
