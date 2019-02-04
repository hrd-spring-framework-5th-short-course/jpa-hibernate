package com.example.demojpahibernate;

import com.example.demojpahibernate.entitties.Person;
import com.example.demojpahibernate.entitties.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@SpringBootApplication
@Transactional
public class DemoJpaHibernateApplication implements ApplicationRunner {

    Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaHibernateApplication.class, args);
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        Student student = new Student("Kimsay");
//
//        this.entityManager.persist(student);
//
//        Student findStudent = this.entityManager.find(Student.class, 1);
//
//        System.out.println(findStudent);
//
//        this.entityManager.remove(findStudent);

        Person person1 = new Person("Person name", "male", 23);
        this.entityManager.persist(person1);

        Person person2 = new Student("Student name", "female", 20, "RUPP", 55.5);
        this.entityManager.persist(person2);

        logger.info("save success!: " + person2);
//        logger.error();
//        logger.warn();
    }
}

