package com.example.SpringBootNtt.controller;

import com.example.SpringBootNtt.entity.Student;
import com.example.SpringBootNtt.entity.Teacher;
import com.example.SpringBootNtt.entity.TeacherToField;
import com.example.SpringBootNtt.repository.TeacherRepository;
import com.example.SpringBootNtt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping("/teacher/{name}/{edad}")
    public List<Teacher> getTeacherByNameAndAge(@PathVariable("name") String name, @PathVariable("edad") Integer edad){
        return service.getTeacherByNameAndAge(name,edad);
    }

    @GetMapping("/teacherByQuery/{name}/{edad}")
    public List<Teacher> getTeacherByNameAndAgeByQuery(@PathVariable("name") String name, @PathVariable("edad") Integer edad){
        return teacherRepository.findTeacherByNameAndEdadByQueryNAtive(name, edad);
    }

    @GetMapping("/teacherByJPQL/{name}/{edad}")
    public List<Teacher> getTeacherByNameAndAgeByJPQL(@PathVariable("name") String name, @PathVariable("edad") Integer edad){
        return teacherRepository.findTeacherByNameAndEdadByJPQL(name, edad);
    }

    @GetMapping("/teacherByJPQL/{edad}")
    public List<TeacherToField> getTeacherByName2(@PathVariable Integer edad){
        return service.getTeacherByAge(edad);
    }

    @GetMapping("/teacherByJPQL2/{edad}")
    public List<String> getTeacherByNameAndAgeByJPQL3(@PathVariable Integer edad){
        return service.getTeacherByAge2(edad);
    }

    @GetMapping("/teachercourse/{name}")
    public List<Teacher> getTeacherByNameAndAgeByJPQL3(@PathVariable String name){
        return service.getTeacherByCourse(name);
    }

    //Creacion del alumno
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        System.out.println("Se hizo la solicitud");
        service.AddStudent(student);
        return ResponseEntity.ok(student);

    }



}