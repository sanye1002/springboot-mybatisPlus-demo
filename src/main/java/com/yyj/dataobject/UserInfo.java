package com.yyj.dataobject;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by 超级战机
 * 2018-02-28 12:15
 */
@TableName("user_info")
@Data
public class UserInfo implements Serializable{

    @TableId
    //用户id
    private String userId;

    //用户名
    private String username;

    //密码
    private String password;

    //手机号码
    private String phone;

    //头像
    private String avatar;

    //年龄
    private int age;

    //性别 男=1 女=0
    private int gender;

    //qq
    private String qq;

    //微信openid
    private String openid;

    public UserInfo() {
    }
}
