package com.example.parking_system_java.com.it.www.ServiceImpl;

import com.example.parking_system_java.com.it.www.mapper.UserMapper;
import com.example.parking_system_java.com.it.www.pojo.User;
import com.example.parking_system_java.com.it.www.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserMapper userMapper;

    /**
     * 用户登录判断方法
     * @param user
     * @return
     */
    @Override
    public User findUserByLogin(User user) {
        return userMapper.findUserByLogin(user);
    }
}
