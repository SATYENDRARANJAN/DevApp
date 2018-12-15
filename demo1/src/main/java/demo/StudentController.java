package demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import demo.StudentRepository;


@RestController
@RequestMapping("/api")
public class StudentController {

	 @Autowired
	 StudentRepository studentRepository;
	
	// Create a new Note
	 @PostMapping("/studAdd")
	 public Student createNote(@Valid @RequestBody Student s) {
	     return studentRepository.save(s);
	 }
}
