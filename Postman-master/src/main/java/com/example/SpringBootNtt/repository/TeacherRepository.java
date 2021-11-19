package com.example.SpringBootNtt.repository;

import com.example.SpringBootNtt.entity.Teacher;
import com.example.SpringBootNtt.entity.TeacherToField;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

    //Esto va igual al nombre de las variables para que lo haga JPA
    List<Teacher> findTeacherByNameAndEdad(String name, Integer edad);
    
    @Query(value = "Select * from profesores where name=:name and edad=:edad", nativeQuery = true)
    List<Teacher> findTeacherByNameAndEdadByQueryNAtive(String name, Integer edad);

    @Query(value = "Select t from Teacher t where t.name=?1 and t.edad=?2")
    List<Teacher> findTeacherByNameAndEdadByJPQL(String name, Integer edad);

    //New Try Only gets Name Teacher
    @Query(value = "Select t.name from Teacher t where t.edad=:edad")
    List<String> findTeacherByNameAndEdadByJPQL2(Integer edad);

    @Query(value = "Select new com.example.SpringBootNtt.entity.TeacherToField(t.name, t.address)from Teacher t where t.edad=:edad")
    List<TeacherToField> findTeacherByNameAndEdadByJPQL3(Integer edad);

    @Query(value = "Select t from Teacher t join t.cursoList c where c.name=:name")
    List<Teacher> findTeacherCourseJoinByName(String name);
}


