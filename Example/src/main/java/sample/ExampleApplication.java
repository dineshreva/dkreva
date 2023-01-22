package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.stereotype.Component;

@SpringBootApplication

public class ExampleApplication {
	  public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
	  
	  Course12 course = context.getBean(Course12.class);
	  course.getName();
	  System.out.println("  First Demo Project ");
	  
	  }
	 
}
