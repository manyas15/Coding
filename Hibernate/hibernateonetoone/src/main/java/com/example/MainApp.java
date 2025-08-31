package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
        // Load config and build session factory
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Person.class).
                addAnnotatedClass(Passport.class).
                buildSessionFactory();

        Session session = factory.openSession();

        try {
            Person person = new Person();
            person.setName("Peter");

            Passport passport = new Passport();
            passport.setPassportNumber("P12345");

            person.setPassport(passport);

            session.beginTransaction();
            session.persist(person);
            session.getTransaction().commit();

            System.out.println("Details added successfully");
        } finally {
            session.close();
            factory.close();
        }
    }
}
