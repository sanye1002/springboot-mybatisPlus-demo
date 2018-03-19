package com.yyj.service.impl;

import com.yyj.dataobject.UserInfo;
import com.yyj.form.UserForm;
import com.yyj.mapper.UserInfoMapper;
import com.yyj.service.UserInfoService;
import com.yyj.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 超级战机
 * 2018-02-28 12:52
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;


    @Override
    public UserInfo findOne(String userId) {
        return userInfoMapper.selectById(userId);
    }

    @Override
    public Integer save(UserForm userForm) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userForm,userInfo);
        userInfo.setUserId(KeyUtil.genUniqueKey());
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public Integer deleteById(String userId) {
        UserInfo userInfo = userInfoMapper.selectById(userId);
        if (userInfo==null){
            return 0;
        }
        return userInfoMapper.deleteById(userId);
    }
}
