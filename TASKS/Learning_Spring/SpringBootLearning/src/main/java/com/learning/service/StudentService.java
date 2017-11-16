package com.learning.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.learning.modal.StudentModal;




public interface StudentService {
	
	public List<StudentModal> getAllStudents();

}
