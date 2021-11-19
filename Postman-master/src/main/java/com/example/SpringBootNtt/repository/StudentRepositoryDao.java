package com.example.SpringBootNtt.repository;

import com.example.SpringBootNtt.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryDao extends CrudRepository<Student, Integer> {
}
