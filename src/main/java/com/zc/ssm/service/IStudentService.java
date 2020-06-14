package com.zc.ssm.service;

import java.util.List;

import com.zc.ssm.model.Student;
import com.zc.ssm.util.PageBean;

public interface IStudentService {
	int deleteByPrimaryKey(Integer sid);

    int insert(Student record);


    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKey(Student record);
    
    List<Student> listStudentPager(Student record,PageBean pageBean);
}
