package LearningProjectStructure.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import LearningProjectStructure.dao.StudentDao;
import LearningProjectStructure.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;
	public String StudentDisplay(String a) {
		int a1=1;
		System.out.println(a1);
		studentDao.delete(1);
		return "hi";
		
	}

}
