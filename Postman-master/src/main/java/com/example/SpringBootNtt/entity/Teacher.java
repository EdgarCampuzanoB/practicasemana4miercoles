package com.example.SpringBootNtt.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="Profesores")
@JsonIgnoreProperties
public class Teacher {

    @OneToMany(cascade = {CascadeType.ALL})
    @Column(name = "curso")
    private List<Curso> cursoList;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;
    private Integer edad;

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public Teacher() {
    }

    public Teacher(List<Curso> cursoList, String name, String address, Integer edad) {
        this.cursoList = cursoList;
        this.name = name;
        this.address = address;
        this.edad = edad;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


}
