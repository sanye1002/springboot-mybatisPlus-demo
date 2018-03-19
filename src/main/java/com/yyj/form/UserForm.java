package com.yyj.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by 超级战机
 * 2018-02-28 13:27
 */
@Data
public class UserForm {

    @NotNull(message = "用户名不能为空")
    //用户名
    private String username;

    //密码
    @NotNull(message = "密码不能为空")
    private String password;
    @NotNull(message = "手机号码不能为空")
    //手机号码
    private String phone;

    //头像
    private String avatar;
    @NotNull(message = "年龄不能为空")
    //年龄
    private int age;
    @NotNull(message = "性别不能为空")
    //性别 男=1 女=0
    private int gender;

    //qq
    private String qq;
}
