package com.example.qyy.controller;

import com.example.qyy.dao.ApplyDAO;
import com.example.qyy.mapper.ApplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Index {

    @Autowired
    private ApplyMapper applyMapper;

    @RequestMapping("/")
    String home() {
        ApplyDAO applyDAO = applyMapper.selectById(1);
        return "Hello World!";
    }
}
