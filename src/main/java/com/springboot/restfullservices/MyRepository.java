package com.springboot.restfullservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<Employee,Integer>{

}
