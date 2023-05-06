package com.evan.study_spb2.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.Map;

public class TokenInterceptor implements HandlerInterceptor {

    //  前置处理
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        if(token != null){
            System.out.println("发现token: " + token + ",准备用户校验");
            System.out.println("用户身份校验通过");
            return true;
        }else{
            ObjectMapper objectMapper = new ObjectMapper();
            Map result = new LinkedHashMap();
            result.put("code","500");
            result.put("msg","请求未包含token，用户校验失败");
            String json = objectMapper.writeValueAsString(result);
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().println(json);
            return false;
        }
    }

    //后置处理
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    //渲染后的处理 前后端分离不需要用
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
