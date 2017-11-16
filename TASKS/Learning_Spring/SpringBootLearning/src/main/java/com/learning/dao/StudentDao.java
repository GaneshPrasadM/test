package com.learning.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.learning.modal.StudentModal;

@Component
public interface StudentDao extends CrudRepository<StudentModal, String>  {

}
