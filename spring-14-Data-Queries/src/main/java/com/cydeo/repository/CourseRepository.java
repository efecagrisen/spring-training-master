package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //Find all courses by category
    List<Course> findByCategory(String category);

    //Find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //0:25

    //Checks if a course with the supplied name exists. Return true if exists, false otherwise

    //Returns the count of courses for the given category

    //Finds all the courses that start with the given course name string

    //Find all courses by category and returns a stream







}
