package com.example.SpringBootNtt.repository;

import com.example.SpringBootNtt.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    @Autowired

    StudentRepositoryDao studentRepositoryDao;

    public void creacionEstudiante(Student student) {
        studentRepositoryDao.save(student);
    }
}
