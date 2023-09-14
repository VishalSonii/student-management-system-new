package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemNewApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemNewApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	
 	@Override 
 	public void run(String... args) throws Exception { 
 		
 	/*	Student student1= new Student("vishal" , "Soni" , "vishalsoni@gmail.com" );
	  studentRepository.save(student1); Student student2 = new Student("mayank" ,
	 * "chauhan" , "mayankchauhan@gmail.com" ); studentRepository.save(student2);
	 * Student student3 = new Student("Rishi" , "Rana" , "rishirana@gmail.com" );
	 * studentRepository.save(student3); 
	 */
 	}
}
 