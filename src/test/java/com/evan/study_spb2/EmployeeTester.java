package com.evan.study_spb2;

import com.evan.study_spb2.entity.Employee;
import com.evan.study_spb2.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class EmployeeTester {

    @Resource
    EmployeeMapper employeeMapper;

    @Test
    public void testSelectAll() {
        List<Employee> employees = employeeMapper.selectAll();
        for (Employee employee: employees) {
            System.out.println(employee.getEname());
        }
    }

    @Test
    public void testInsert(){
        int insert = employeeMapper.insert(new Employee(10001, "SORA", "MANAGER", new Date(), 10000f, 20));
        System.out.println("新增了" + insert + "条数据");
    }

    @Test
    public void testUpdate(){
        int update = employeeMapper.update(new Employee(10001, "SORA", "MANAGER", new Date(), 15000f, 20));
        System.out.println("更新了" + update + "条数据");
    }

    @Test
    public void testDelete(){
        int delete = employeeMapper.delete(10001);
        System.out.println("删除了了" + delete + "条数据");
    }

}
