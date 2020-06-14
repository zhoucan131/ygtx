package com.zc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zc.ssm.mapper.StudentMapper;
import com.zc.ssm.model.Student;
import com.zc.ssm.service.IStudentService;
import com.zc.ssm.util.PageBean;

@Transactional
@Service
public class StudentServcieImpl implements IStudentService{

	@Autowired
	private  StudentMapper studentMapper;
	
	
	@Override
	public int deleteByPrimaryKey(Integer sid) {
		return studentMapper.deleteByPrimaryKey(sid);
	}

	@Override
	public int insert(Student record) {
		return studentMapper.insert(record);
	}

	@Override
	public Student selectByPrimaryKey(Integer sid) {
		return studentMapper.selectByPrimaryKey(sid);
	}

	@Override
	public int updateByPrimaryKey(Student record) {
		return studentMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Student> listStudentPager(Student record, PageBean pageBean) {
		return studentMapper.listStudentPager(record);
	}

}
