package com.joshuapavan.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class SchoolRequest {
    private String schoolName;
    private String email;
}
