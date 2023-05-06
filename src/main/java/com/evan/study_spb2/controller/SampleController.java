package com.evan.study_spb2.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class SampleController {

    @GetMapping("/{group}/{uid}")
    public Map findUser(@PathVariable("group") String group,@PathVariable("uid") String uid){
        Map<String,Object> params = new HashMap<>();
        params.put("group",group);
        params.put("uid",uid);
        return params;
    }

    @GetMapping("/page1")
    public Map findUser(@RequestParam(defaultValue = "1",name = "p") int page,@RequestParam(defaultValue = "10",name="r") int rows){
        Map<String,Object> params = new HashMap<>();
        params.put("page",page);
        params.put("rows",rows);
        return params;
    }

    @GetMapping("/get_header")
    public Map getHeader(@RequestHeader("token") String accessToken,String id){
        Map<String,Object> params = new HashMap<>();
        params.put("access_token",accessToken);
        params.put("id",id);
        return params;
    }

}
