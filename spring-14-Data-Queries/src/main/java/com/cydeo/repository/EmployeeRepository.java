package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //Display all employees with email address ""
    List<Employee> findByEmail(String email);

    //Display all employees with firstname "" and last name "",
    //also show all employees with an email address ""
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display all employees that first name is not ""
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ""
    List<Employee> findByLastNameStartingWith(String pattern);

    //Display all employees with salaries higher than ""
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ""
    List<Employee> findBySalaryLessThan(Integer salary);

    //Display all employees that has been hired between "" and ""
    List<Employee> findByHireDateBetween(LocalDate dateBeginning, LocalDate dateEnding);

    //Display all employees where salaries greater and equal to "" in order-salary
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //Display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    // ######################################################

    @Query("SELECT e FROM Employee e WHERE e.email='bmanueau0@dion.ne.jp'")
    Employee retrieveEmployeeDetail();


    @Query("SELECT e.salary FROM Employee e WHERE e.email='bmanueau0@dion.ne.jp'")
    Integer retrieveEmployeeSalary();

    //Not Equal
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    //Like / Contains / Starts-with / Ends-with
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //Less Than
    @Query("SELECT e.firstName FROM Employee e WHERE e.salary < ?1")
    List<String> retrieveEmployeeSalaryLessThan(int salary);

    //Greater Than
    @Query("SELECT e.firstName FROM Employee e WHERE e.salary > ?1")
    List<String> retrieveEmployeeSalaryGreaterThan(int salary);

    //BETWEEN
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> retrieveEmployeeSalaryBetween(int salary1, int salary2);

    //BEFORE
    @Query("SELECT e FROM Employee e WHERE e.hireDate > ?1")
    List<Employee> retrieveEmployeeHireDateBefore(LocalDate hireDate);

    //NULL
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL")
    List<Employee> retrieveEmployeeEmailIsNull(String email);

    //NOT NULL
    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee> retrieveEmployeeEmailIsNotNull(String email);


    //SORTING in Asc Order
    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee> retrieveEmployeeSalarySortedAsc();


    //SORTING in Desc Order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC ")
    List<Employee> retrieveEmployeeSalarySortedDesc();

    //Native Query
    @Query(value = "SELECT * FROM employees WHERE salary = ?1", nativeQuery = true)
    List<Employee> retrieveEmployeeDetailBySalary(int salary);


    //Named Parameter
    @Query("SELECT e FROM Employee e WHERE e.salary = :salary")
    List<Employee> retrieveEmployeeSalary(@Param("salary") int salary);
















}
