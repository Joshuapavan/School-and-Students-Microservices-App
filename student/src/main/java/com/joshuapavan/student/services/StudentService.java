package com.joshuapavan.student.services;

import com.joshuapavan.student.dto.StudentRequest;
import com.joshuapavan.student.models.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> getAllStudents();

    StudentEntity createStudent(StudentRequest student);
}
