package com.example.qyy.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class ApplyDAO {

    private int id;
    private int applyType;
    private int applyId;
    private int applyStatus;
    private Date gmtCreate;
    private Date gmtUpdate;

}
