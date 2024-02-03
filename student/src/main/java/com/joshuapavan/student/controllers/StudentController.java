package com.joshuapavan.student.controllers;

import com.joshuapavan.student.dto.StudentRequest;
import com.joshuapavan.student.models.StudentEntity;
import com.joshuapavan.student.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentEntity> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentEntity createStudent(@RequestBody StudentRequest studentRequest){
        return studentService.createStudent(studentRequest);
    }
}
