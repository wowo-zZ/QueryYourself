package com.example.qyy.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
public class QueryDAO {

    private int id;

    private int timeout;

    @NotNull
    private int resultType;

    @NotNull
    private String content;

    private Date gmtCreate;

    private Date gmtUpdate;

}
