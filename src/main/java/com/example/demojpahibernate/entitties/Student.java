package com.example.demojpahibernate.entitties;

import javax.persistence.*;

@Entity
//@DiscriminatorValue(value = "STUDENT_TYPE")
public class Student extends Person{

    private String university;

    private Double score;

    public Student() {
    }


    public Student(String university, Double score) {
        this.university = university;
        this.score = score;
    }

    public Student(String name, String gender, int age, String university, Double score) {
        super(name, gender, age);
        this.university = university;
        this.score = score;
    }

    public Student(Integer id, String name, String gender, int age, String university, Double score) {
        super(id, name, gender, age);
        this.university = university;
        this.score = score;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", score=" + score +
                '}';
    }
}
