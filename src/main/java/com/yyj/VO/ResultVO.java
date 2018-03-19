package com.yyj.VO;

import lombok.Data;

/**
 * Created by 超级战机
 * 2018-02-28 13:05
 */
@Data
public class ResultVO<T> {
    /* 错误码*/
    private Integer code;
    /* 信息*/
    private String message;
    /*数据对象*/
    private T Data;

}
