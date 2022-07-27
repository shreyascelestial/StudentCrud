package com.example.Studentcurd.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Studentcurd.domain.Student;
import com.example.Studentcurd.repository.StudentRepository;

@Service
public class Studentservice {
    
	@Autowired
	private StudentRepository repo;
	

	public List<Student> listAll() {
		return repo.findAll();
	}
	

	public void save(Student std) {
		repo.save(std);
	}
	
	
	public void delete(long id) {
		repo.deleteById(id);
	}
    
	
	public Student get(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
}
