package com.yyj.service;

import com.yyj.dataobject.UserInfo;
import com.yyj.form.UserForm;

/**
 * Created by 超级战机
 * 2018-02-28 12:37
 * 用户信息server借口层
 */
public interface UserInfoService {

    UserInfo findOne(String userId);

    Integer save(UserForm userForm);

    Integer deleteById(String userId);

}
