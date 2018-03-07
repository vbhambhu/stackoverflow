package com.example.stackoverflow.repositories;

import com.example.stackoverflow.entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {


}