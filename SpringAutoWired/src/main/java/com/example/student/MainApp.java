package com.example.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        student.setName("John");
        Address address = student.getAddress();
        address.setCity("New York");
        address.setStreet("Main Street");
        student.display();
    }
}
