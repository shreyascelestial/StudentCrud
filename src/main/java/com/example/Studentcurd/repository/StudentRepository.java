package com.example.Studentcurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Studentcurd.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student ,Long>{

}
