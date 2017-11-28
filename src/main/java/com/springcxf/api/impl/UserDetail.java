package com.springcxf.api.impl;


import com.springcxf.bean.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Date;

public class UserDetail {

    @GET
    @Produces("application/json")
    @Path("/{userId}")
    public User getUserByUserId(@PathParam("userId") String userId){
        User u = new User();
        u.setGender("男");
        u.setNickname("jiangBUG");
        u.setRegisterDate(new Date());
        u.setUserId(userId);
        return u;
    }
}
