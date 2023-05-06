package com.evan.study_spb2;

import com.evan.study_spb2.entity.Department;
import com.evan.study_spb2.mapper.DepartmentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class DepartmentMapperTestor {
    @Resource
    DepartmentMapper departmentMapper;

    @Test
    public void testSelectAll(){
        List<Department> departments = departmentMapper.selectAll();
        System.out.println(departments.size());
    }

    

}
