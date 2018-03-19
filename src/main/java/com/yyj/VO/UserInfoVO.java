package com.yyj.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by 超级战机
 * 2018-02-28 13:06
 */
@Data
public class UserInfoVO {
    @JsonProperty
    //用户id
    private String userId;
    @JsonProperty
    //用户名
    private String username;
    @JsonProperty
    //密码
    private String password;
    @JsonProperty
    //手机号码
    private String phone;
    @JsonProperty
    //头像
    private String avatar;
    @JsonProperty
    //年龄
    private int age;
    @JsonProperty
    //性别 男=1 女=0
    private int gender;
    @JsonProperty
    //qq
    private String qq;
    @JsonProperty
    //微信openid
    private String openid;
}
