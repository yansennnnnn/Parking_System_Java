package com.example.parking_system_java.com.it.www.controller;

import com.example.parking_system_java.com.it.www.pojo.User;
import com.example.parking_system_java.com.it.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param mapParam
     * @return
     */
    @RequestMapping("/userLogin")
    @ResponseBody
    public Map<String, String> userLogin(@RequestBody Map<String, String> mapParam){
        System.out.println("登录账号为" + mapParam.get("userAccount"));
        System.out.println("登录密码为" + mapParam.get("userPassword"));
        User user = new User(mapParam.get("userAccount"));

        User resultMap = userService.findUserByLogin(user);

        Map<String, String> map = new HashMap<>();
        if (null != resultMap){

            //判断登录密码是否正确
            if (mapParam.get("userPassword").equals(resultMap.getUserPassword())) {
                map.put("code", "200");
            } else {
                map.put("code", "400");
                map.put("message", "您输入的密码有误，请重新输入！");
            }

        } else {
            map.put("code", "400");
            map.put("massage", "您输入的账号有误，请重新输入！");
        }

        return map;

    }

}
