package com.zc.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.zc.ssm.model.Student;
import com.zc.ssm.service.IStudentService;
import com.zc.ssm.util.PageBean;

@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	
//	produces = "text/plain;charset=utf-8"
	@RequestMapping(value="/getById")
	@ResponseBody
	public Student getById(Integer sid) {
		System.out.println("------------"+sid);
		Student student = studentService.selectByPrimaryKey(sid);
		return student;
	}
	
//	@RequestMapping(value="/listStudentPager")
//	public Map<String, Object> listStudentPager(Student stu,PageBean pageBean,HttpServletRequest req) {
//		Map map=new HashMap<String, Object>();
//		System.out.println("------------765432"+stu.getSname());
//		pageBean.initPageBean(req, pageBean);
//		 List<Student> list = studentService.listStudentPager(stu, pageBean);
//		 System.out.println("------"+pageBean.getTotal());
//		 map.put("list", list);
//		 map.put("total", pageBean.getTotal());
//		return map;
//	}
	
	
	
	@RequestMapping(value="/listStudentPager")
	public ModelAndView listStudentPager(Student stu,PageBean pageBean,HttpServletRequest req) {
		ModelAndView modelAndView=new ModelAndView();
		System.out.println("------------765432"+stu.getSname());
		pageBean.initPageBean(req, pageBean);
		 List<Student> list = studentService.listStudentPager(stu, pageBean);
		 System.out.println("------"+pageBean.getTotal());
	        modelAndView.setViewName("book/listBook");
	        modelAndView.addObject("list",list);
	        modelAndView.addObject("pageBean",pageBean);
		return modelAndView;
	}
	
	
	
	
	
}
