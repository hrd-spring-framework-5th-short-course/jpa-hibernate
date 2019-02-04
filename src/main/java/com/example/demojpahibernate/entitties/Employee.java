package com.example.demojpahibernate.entitties;

import javax.persistence.Entity;

@Entity
public class Employee extends Person{

    private String company;

    private Double salary;

    public Employee() {
    }

    public Employee(String company, Double salary) {
        this.company = company;
        this.salary = salary;
    }

    public Employee(Integer id, String name, String gender, int age, String company, Double salary) {
        super(id, name, gender, age);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
