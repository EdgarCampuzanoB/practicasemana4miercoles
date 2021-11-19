package com.example.SpringBootNtt.repository;

import com.example.SpringBootNtt.entity.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class TeacherRepositoryImp{

    @PersistenceContext
    private EntityManager entityManager;

    public List<Teacher> findTeacherByAddress(String name, String address){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Teacher> teacherCriteriaQuery;
        return null;
    }


}
