package com.cydeo.repository;

import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
