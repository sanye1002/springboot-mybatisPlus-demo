package com.yyj.utils;

import com.yyj.VO.ResultVO;

/**
 * Created by 超级战机
 * 2018-02-28 15:04
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        resultVO.setData(object);
        return  resultVO;
    }
    public static ResultVO success(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        return  resultVO;
    }
    public static ResultVO error(Integer code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setMessage(msg);
        resultVO.setCode(code);
        return resultVO;

    }
}
