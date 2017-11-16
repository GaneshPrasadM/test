package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.learning.modal.StudentModal;
import com.learning.service.StudentService;

@RestController
public class StudentController {
	@Autowired  
    private StudentService studentService;   
    @RequestMapping("/")  
    public List<StudentModal> getAllStudents(){
    	
		return studentService.getAllStudents();	
    }
    
    @RequestMapping("/index")  
    public ModelAndView getIndexpage(){
    	ModelAndView modelAndView = new ModelAndView("index");
    	
		return modelAndView;
    	
    }
}
