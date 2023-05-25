package com.cibertec.edu.daw.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.daw.models.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Long> {
	public List <Student> findAll();
}
