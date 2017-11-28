package com.springcxf.api;

import com.springcxf.bean.User;

import javax.jws.WebService;

@WebService
public interface UserService {


    User getUserInfo(String id);


}
