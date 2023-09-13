package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository (new spring versions do not need this)
public interface CarRepository extends JpaRepository<Car, Long> {


}
