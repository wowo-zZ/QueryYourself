package com.example.qyy.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class QueryDAO {

    private int id;
    private int timeout;
    private int resultType;
    private String content;
    private Date gmtCreate;
    private Date gmtUpdate;

}
