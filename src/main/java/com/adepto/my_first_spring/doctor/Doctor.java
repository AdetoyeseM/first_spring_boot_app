package com.adepto.my_first_spring.doctor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Doctor {

    private  Long id;
    private String name;
    private LocalDateTime dateofBirth;
    private String email;
    private Integer age;



    public Doctor() {
    }


    public Doctor(Long id, String name, LocalDateTime dateofBirth, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.email = email;
        this.age = age;
    }

    public Doctor(String name, LocalDateTime dateofBirth, String email, Integer age) {

        this.name = name;
        this.dateofBirth = dateofBirth;
        this.email = email;
        this.age = age;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDateTime dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
