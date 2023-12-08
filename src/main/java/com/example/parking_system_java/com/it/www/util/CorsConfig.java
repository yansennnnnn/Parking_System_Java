package com.example.parking_system_java.com.it.www.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")       //允许所有的路由
                .allowedOriginPatterns("*")        //允许所有来源
                .allowedHeaders(CorsConfiguration.ALL)  //允许所有的请求头
                .allowedMethods(CorsConfiguration.ALL)  //允许所有请求进行访问
                .allowCredentials(true)   //允许前端带上凭证 （cookie or Session）
                .maxAge(3600)  //一个小时之内不需要预检
        ;
    }

}
