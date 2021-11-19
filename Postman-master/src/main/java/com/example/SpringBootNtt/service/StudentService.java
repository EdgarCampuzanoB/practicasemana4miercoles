package com.example.SpringBootNtt.service;

import com.example.SpringBootNtt.entity.Student;
import com.example.SpringBootNtt.entity.Teacher;
import com.example.SpringBootNtt.entity.TeacherToField;
import com.example.SpringBootNtt.repository.StudentRepository;
import com.example.SpringBootNtt.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository StudentRepo;

    @Autowired
    TeacherRepository teacherRepository;

    public void AddStudent(Student student) {

        StudentRepo.creacionEstudiante(student);

    }

    public List<Student> getLista() {
        return null;
    }


    public List<Student> getStudents() {
        return StudentRepo.getStudents();
    }

    public List<Teacher> getTeacherByNameAndAge(String name, Integer edad) {
        return teacherRepository.findTeacherByNameAndEdad(name, edad);
    }

    public List<TeacherToField> getTeacherByAge(Integer edad) {
        return teacherRepository.findTeacherByNameAndEdadByJPQL3(edad);
    }

    public List<String> getTeacherByAge2(Integer edad) {
        return teacherRepository.findTeacherByNameAndEdadByJPQL2(edad);
    }

    public List<Teacher> getTeacherByCourse(String name) {
        return  teacherRepository.findTeacherCourseJoinByName(name);
    }


//    private List<Student> students = new ArrayList<>();
//
//    //con esto se agrega un Alumno
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public Student getStudent(String nomStudent) {
//        //El foreach va iterando hasta que se acabe la lista hasta que la condicion se corte
//        for (Student s : students) {
//            //Si un nombre conicide con el nombre del alumno buscado se retorna
//            //Si ese nombre es null romperia el ciclo
//            if (nomStudent.equals(s.getName())) {
//                return s;
//            }
//
//
//        }
//        // en caso de que no exista el alumna retorna un nul
//        return new Student("Alumno no encontrado");
//    }
//
//    public List<Student> getLista() {
//        return students;
//    }
}

