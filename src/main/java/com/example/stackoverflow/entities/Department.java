package com.example.stackoverflow.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

import org.springframework.lang.NonNull;

import java.util.List;


@Entity
public class Department {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long department_number;

    @NonNull
    @Column(nullable=false, unique=true)
    private String name;


    @OneToMany(mappedBy="department")
   // @JsonBackReference
    private List<Member> members;

    public Long getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(Long department_number) {
        this.department_number = department_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
