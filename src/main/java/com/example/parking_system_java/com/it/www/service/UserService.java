package com.example.parking_system_java.com.it.www.service;

import com.example.parking_system_java.com.it.www.pojo.User;

public interface UserService {

    /**
     * 判断用户登录
     * @param user
     * @return
     */
    public User findUserByLogin(User user);

}
