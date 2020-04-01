package com.example.qyy.controller;

import com.example.qyy.dao.QueryDAO;
import com.example.qyy.dto.ResultDTO;
import com.example.qyy.mapper.QueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("query")
public class Query {

    @Autowired
    QueryMapper queryMapper;

    @Autowired
    ResultDTO resultDTO;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultDTO getQueryList() {
        resultDTO.setErrorCode(0);
        resultDTO.setMessage("获取成功");
        resultDTO.setData(queryMapper.pageGetList(0, 10));
        return resultDTO;
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public ResultDTO insert() {
        return null;
    }
}
