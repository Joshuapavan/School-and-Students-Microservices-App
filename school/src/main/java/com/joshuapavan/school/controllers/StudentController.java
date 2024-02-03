package com.joshuapavan.school.controllers;

import com.joshuapavan.school.dto.SchoolRequest;
import com.joshuapavan.school.models.SchoolEntity;
import com.joshuapavan.school.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
public class StudentController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SchoolEntity> getAllSchools(){
        return schoolService.getAllSchools();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SchoolEntity createSchool(@RequestBody SchoolRequest schoolRequest){
        return schoolService.createSchool(schoolRequest);
    }
}
