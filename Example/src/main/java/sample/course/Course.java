package sample.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Course {
@GetMapping("/courses")
public List<Courses> getAllCourses(){
	return Arrays.asList(new Courses(1,"java","in60minuts"));
}
}
