package com.example.stackoverflow.entities;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import javax.persistence.Id;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long number;

    @NonNull
    @Column(nullable=false)
    private String name;

    @ManyToOne
    @JoinColumn(name="department_number")
    private Department department;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
