package com.test.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.test.test.model.Student;
import com.test.test.repo.StudentRepo;

import java.util.*;

@Controller
public class MainController {
	@Autowired
	StudentRepo studRepo;
	
//	@RequestMapping("/")
//	 @ResponseBody
//	public ModelAndView home(@RequestParam("uname") String uname) {
//
//		System.out.println("hello "+uname);
//		
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("uname", uname);
//		mv.setViewName("home.html");
//		return mv;
//	}

	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addStudent")
	public String addEmp(Student student) {
		String studentId = "";
	    try {
	    if(student.getFirstName()!=null)
	      studRepo.save(student);
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "addStudent.jsp";
	}
	
	@RequestMapping("/getAllStudent")
	@ResponseBody
	public List<Student> getAllStudents() {
		List<Student> list=studRepo.findAll();
		return list;
//		ModelAndView mv=new ModelAndView();
//		List<Student> list=studRepo.findAll();
//		mv.addObject("uname", list);
//		mv.setViewName("viewAllStudents.jsp");
//		return mv;
	}
}
