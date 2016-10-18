package com.synertrade.training.core.student.service;

import com.synertrade.training.core.common.service.TransactionalService;
import com.synertrade.training.core.student.StudentEntity;
import com.synertrade.training.core.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by tudorg on 10/18/2016.
 */
@TransactionalService
public class StudentService{
    @Autowired
    StudentRepository studentRepository;

    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }
}
