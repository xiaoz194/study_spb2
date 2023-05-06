package com.evan.study_spb2.configuration;

import com.evan.study_spb2.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringWebConfiguration implements WebMvcConfigurer {

    //对当前系统中的拦截器进行注册配置
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new TokenInterceptor());
        interceptorRegistration.addPathPatterns("/**"); // 对所有请求拦截
    }
}
