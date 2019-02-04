package com.example.demojpahibernate.entitties;

import javax.persistence.*;

@Entity
//@DiscriminatorColumn(name = "DTYPE_CUSTOM")
//@DiscriminatorValue(value = "PERSON_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private String name;
    private String gender;

    private int age;

    public Person() {
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person(Integer id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
