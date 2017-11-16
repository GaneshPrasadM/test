package LearningProjectStructure.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LearningProjectStructure.service.StudentService;
@RestController
public class mainController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/display")
	public String displayGreetings(){
		System.out.println("Inside Controller");
        studentService.StudentDisplay("You Have Reached Student Service");
		return "Hello i am Displaying";
		
	}

}
