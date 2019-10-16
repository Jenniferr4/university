package org.improving.university;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Student {
    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false)
    private String name;

    public Student(){
    }

    public Student(String name) {
    this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
