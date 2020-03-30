package com.example.qyy.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PushDAO {

    private int id;
    private int queryId;
    private int pushType;
    private Date gmtCreate;
    private Date gmtUpdate;

}
