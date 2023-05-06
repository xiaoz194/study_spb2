package com.evan.study_spb2.mapper;

import com.evan.study_spb2.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
     List<Employee> selectAll();
     int insert(Employee employee);
     int update(Employee employee);
     int delete(Integer empno);
}
