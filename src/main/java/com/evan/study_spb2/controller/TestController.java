package com.evan.study_spb2.controller;

import com.evan.study_spb2.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

    @GetMapping("/json")
    @ResponseBody
    public User testJson(){
        User user = new User();
        user.setAge(18);
        user.setPhone("18831223332");
        user.setPwd("123456");
        user.setCreateTime(new Date());
        return user;
    }

    @GetMapping("/logger")
    @ResponseBody
    public String testLogger(){
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.debug("debug级别日志");
        return "success";
    }

    @GetMapping("/ex")
    public Map testException(){
        Object obj = null;
        if(obj == null){
            throw new RuntimeException("X员工不存在");
        }
        return new HashMap();
    }



}
