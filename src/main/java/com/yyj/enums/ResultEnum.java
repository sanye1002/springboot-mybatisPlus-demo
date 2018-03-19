package com.yyj.enums;

import lombok.Getter;

/**
 * Created by my on 2018/3/6.
 */
@Getter
public enum ResultEnum {
    success(0,"成功"),
    PARAM_ERROR(1,"参数不正确")
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
