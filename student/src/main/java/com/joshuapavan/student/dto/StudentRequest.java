package com.joshuapavan.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class StudentRequest {
    private String firstName;
    private String lastName;
    private String email;
    private Integer schoolId;
}
