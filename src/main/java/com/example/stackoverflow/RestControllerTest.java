package com.example.stackoverflow;

import com.example.stackoverflow.entities.Company;
import com.example.stackoverflow.entities.Department;
import com.example.stackoverflow.entities.Employee;
import com.example.stackoverflow.entities.Member;
import com.example.stackoverflow.repositories.CompanyRepository;
import com.example.stackoverflow.repositories.DepartmentRepository;
import com.example.stackoverflow.repositories.EmployeeRepository;
import com.example.stackoverflow.repositories.MemberRepository;
import com.example.stackoverflow.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerTest {


    @Autowired
    MemberRepository memberRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    EmployeeRepository employeeRepository;


    @RequestMapping(method= RequestMethod.POST, path="/create")
    public ResponseEntity<Member> createCompany(@RequestBody Company company) {




        for (Employee employee : company.getEmployeeList()){

            System.out.println(employee.getName());

            Employee employeeFromDb = employeeRepository.findByName(employee.getName());

            if(employeeFromDb == null){

                Department department1 = new Department();
                department1.setName(deptName);
                department = departmentRepository.save(department1);
            } else{
                department = alreadyExistsDepartment;
            }


        }

        return  null;


    }

    @RequestMapping(method= RequestMethod.POST, path="/member")
    public ResponseEntity<Member> createMember(@RequestBody Member member) {


        String deptName = member.getDepartment().getName();

        Department department = null;

        Department alreadyExistsDepartment = departmentRepository.findByName(deptName);

        if(alreadyExistsDepartment == null){

            Department department1 = new Department();
            department1.setName(deptName);
            department = departmentRepository.save(department1);
        } else{
            department = alreadyExistsDepartment;
        }

        member.setDepartment(department);
        memberRepository.save (member);
        return null;
        //return new ResponseEntity<Member>(member, HttpStatus.OK);
    }

    @RequestMapping(method= RequestMethod.GET, path="/member/list")
    public List<Member> getMember() {
        return memberRepository.findAll ();
    }
}
