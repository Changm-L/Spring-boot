package com.example.demo.vo;

import lombok.Data;


import java.time.LocalDateTime;

@Data
public class ListVo {
    int seq;
    String title;
    String content;
    LocalDateTime date;
}
