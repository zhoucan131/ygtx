package com.zc.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zc.ssm.model.Student;
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<Student> listStudentPager(Student record);
}