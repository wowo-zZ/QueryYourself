package com.example.qyy.dto;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@Scope("prototype")
public class ResultDTO {

    private int errorCode;
    private String message;
    private List data;

}
