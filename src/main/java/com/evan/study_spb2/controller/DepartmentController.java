package com.evan.study_spb2.controller;

import com.evan.study_spb2.service.DepartmentService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DepartmentController {
    @Resource
    DepartmentService departmentService;

    @GetMapping("/dept/imp")

    public String testImp(){
        departmentService.imp();
        return "success";
    }
}
