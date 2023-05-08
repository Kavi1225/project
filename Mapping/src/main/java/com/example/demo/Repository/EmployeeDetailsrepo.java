package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.EmployeeDetails;

@Repository
public interface EmployeeDetailsrepo extends JpaRepository<EmployeeDetails, Integer> {

}
