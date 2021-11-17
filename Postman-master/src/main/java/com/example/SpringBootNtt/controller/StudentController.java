package com.example.SpringBootNtt.controller;

import com.example.SpringBootNtt.entity.Student;
import com.example.SpringBootNtt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/{nombre}")
    public String holaMundo(@PathVariable String nombre) {
        return "Hola Mundo" + nombre;

    }

    //Creacion del alumno
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        System.out.println("Se hizo la solicitud");
        service.AddStudent(student);
        return ResponseEntity.ok(student);

    }


    @GetMapping("/{pornombre}/{nombrevariable}")
    public Student getStudentByName(@PathVariable("nombrevariable") String name) {
        return service.getStudent(name);
    }

}