package com.springcxf.api.impl;

import com.springcxf.api.UserService;
import com.springcxf.bean.User;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 此为SOAP风格的服务接口实现
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUserInfo(String id) {
        User u = new User();
        u.setGender("男");
        u.setNickname("jiangBUG");
        u.setRegisterDate(new Date());
        u.setUserId(id);
        return u;
    }
}
