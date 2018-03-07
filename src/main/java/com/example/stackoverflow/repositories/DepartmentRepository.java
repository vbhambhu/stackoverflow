package com.example.stackoverflow.repositories;

import com.example.stackoverflow.entities.Department;
import com.example.stackoverflow.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByName(String name);

}
