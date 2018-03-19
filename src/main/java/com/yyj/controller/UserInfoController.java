package com.yyj.controller;

import com.yyj.VO.ResultVO;
import com.yyj.VO.UserInfoVO;
import com.yyj.dataobject.UserInfo;
import com.yyj.form.UserForm;
import com.yyj.service.UserInfoService;
import com.yyj.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by 超级战机
 * 2018-02-28 12:53
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/add")
    public ResultVO<Map<String, String>> add(@Valid UserForm userForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return ResultVOUtil.error(200,bindingResult.getFieldError().getDefaultMessage());
        }else {
            userInfoService.save(userForm);
            return ResultVOUtil.success();
        }
    }

    @GetMapping("/get/{id}")
    public ResultVO<UserInfoVO> findOne(@PathVariable String id){

        if (id==null){
            return ResultVOUtil.error(200,"id不能为空!");
        }else {
            UserInfoVO userInfoVO = new UserInfoVO();
            UserInfo userInfo = userInfoService.findOne(id);
            BeanUtils.copyProperties(userInfo,userInfoVO);
            return ResultVOUtil.success(userInfoVO);
        }
    }
}
