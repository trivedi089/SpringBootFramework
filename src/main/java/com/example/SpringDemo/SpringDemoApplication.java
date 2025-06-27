package com.example.SpringDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Spring starts working...");

		//Doctor doctor = new Doctor();  no need to create object now

		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();

		Nurse nurse = context.getBean(Nurse.class);;
		nurse.assist();
	}



}
