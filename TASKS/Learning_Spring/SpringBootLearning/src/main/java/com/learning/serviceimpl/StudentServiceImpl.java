package com.learning.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.learning.dao.StudentDao;
import com.learning.modal.StudentModal;
import com.learning.service.StudentService;



@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	@Override
	public List<StudentModal> getAllStudents() {
		List<StudentModal> studentModal = new ArrayList<>();  
		studentDao.findAll().forEach(studentModal::add);
		System.out.println(studentModal);
		return studentModal;
	}

	
	

}
