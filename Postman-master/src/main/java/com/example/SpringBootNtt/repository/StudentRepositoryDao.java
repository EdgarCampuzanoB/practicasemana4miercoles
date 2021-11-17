package com.example.SpringBootNtt.repository;

import com.example.SpringBootNtt.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepositoryDao extends CrudRepository<Student, Integer> {
}
