package com.example.SpringBootNtt.repository;

import com.example.SpringBootNtt.entity.Student;
import com.example.SpringBootNtt.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    StudentRepositoryDao studentRepositoryDao;

    @Autowired
    TeacherRepository teacherRepository;

    public void creacionEstudiante(Student student) {
        studentRepositoryDao.save(student);
    }

    public List<Student> getStudents() {
        return (List<Student>) studentRepositoryDao.findAll();
    }

    public List<Teacher> getTeachersByNameAndAge(String name, Integer edad){
        return teacherRepository.findTeacherByNameAndEdad(name, edad);
    }


}
