package com.example.parking_system_java.com.it.www.mapper;

import com.example.parking_system_java.com.it.www.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * 判断用户登录
     * @param user
     * @return
     */
    public User findUserByLogin(User user);

}
