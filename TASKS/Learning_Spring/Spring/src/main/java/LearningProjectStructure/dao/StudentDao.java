package LearningProjectStructure.dao;

import org.springframework.data.repository.CrudRepository;

import LearningProjectStructure.module.StudentModule;

public interface StudentDao extends CrudRepository<StudentModule, Integer> {
	
	

}
