package com.heima.service;

import com.heima.dao.LoginDao;
import com.heima.pojo.User;

public class LoginService {
    public Boolean login(String username,String password) {
        LoginDao dao = new LoginDao();
        User user = dao.queryUserByUserNameAndPassword(username,password);
        System.out.println(user);
       return user!=null;
    }
}
