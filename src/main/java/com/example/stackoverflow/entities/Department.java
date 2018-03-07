package com.example.stackoverflow.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

import org.springframework.lang.NonNull;

import java.util.List;


@Entity
public class Department {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long departmentId;

    @NonNull
    @Column(nullable=false, unique=true)
    private String name;


    @OneToMany(mappedBy="department")
    @JsonBackReference
    private List<Member> members;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
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
