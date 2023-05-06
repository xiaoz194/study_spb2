package com.evan.study_spb2.mapper;

import com.evan.study_spb2.entity.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("select * from dept order by dname;")
    List<Department> selectAll();


    @Insert("insert into dept values (#{deptno},#{dname},#{loc});")
    int insert(Department department);

}
