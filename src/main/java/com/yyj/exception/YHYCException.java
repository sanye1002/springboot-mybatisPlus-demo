package com.yyj.exception;

import com.yyj.enums.ResultEnum;
import lombok.Getter;

/**
 * Created by my on 2018/3/6.
 */
@Getter
public class YHYCException extends RuntimeException {
    private  Integer code;

    public YHYCException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public YHYCException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
