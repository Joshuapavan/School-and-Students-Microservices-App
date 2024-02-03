package com.joshuapavan.student.services.impl;

import com.joshuapavan.student.dto.StudentRequest;
import com.joshuapavan.student.models.StudentEntity;
import com.joshuapavan.student.repositories.StudentRepository;
import com.joshuapavan.student.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity createStudent(StudentRequest studentRequest) {
        StudentEntity student = new StudentEntity();
        student.setFirstName(studentRequest.getFirstName());
        student.setFirstName(studentRequest.getLastName());
        student.setEmail(studentRequest.getEmail());
        return studentRepository.save(student);
    }
}
