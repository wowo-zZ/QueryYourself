package com.example.qyy.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PushLogDAO {

    private int id;
    private int pushId;
    private int applyStatus;
    private Date gmtCreate;

}
