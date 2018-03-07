package com.example.stackoverflow.entities;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import javax.persistence.Id;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long memberId;

    @NonNull
    @Column(nullable=false)
    private String name;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
