package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Student;
import Service.Student_Service;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class Controller {
	
	@Autowired  
    private Student_Service studentservice;
	
	@GetMapping("/students-list")  
    public List<Student> allstudents() { 
		System.out.println("in get request.............");
         return studentservice.getStudents();  
          
    }
	@GetMapping("/hello")  
    public String hello() { 
		System.out.println("in hello request.............");
         return "Hello buddy..";  
	}
}
