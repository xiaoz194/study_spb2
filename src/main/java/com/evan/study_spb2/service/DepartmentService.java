package com.evan.study_spb2.service;

import com.evan.study_spb2.entity.Department;
import com.evan.study_spb2.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Random;


@Service

public class DepartmentService {
    @Resource
    DepartmentMapper departmentMapper;

    //开启声明式事务，要么全部成功，要么回滚（全部失败,默认抛出RuntimeException才会回滚，所以要加上rollbackFor = Exception.class，抛出所有异常都回滚
    //如果加在service上，说明对该service所有方法都生效
    @Transactional(rollbackFor = Exception.class)
    public void imp(){
        for(int i=0;i<4;i++){
//            if(i==2){
//                throw new RuntimeException("我故意的");
//            }
            departmentMapper.insert(new Department(new Random().nextInt(1000000),"测试部门"+i,"BJ"));
        }
    }

}
