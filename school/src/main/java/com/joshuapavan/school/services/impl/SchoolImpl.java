package com.joshuapavan.school.services.impl;

import com.joshuapavan.school.dto.SchoolRequest;
import com.joshuapavan.school.models.SchoolEntity;
import com.joshuapavan.school.repositories.SchoolRepository;
import com.joshuapavan.school.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public List<SchoolEntity> getAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public SchoolEntity createSchool(SchoolRequest schoolRequest) {
        SchoolEntity school = new SchoolEntity();
        school.setSchoolName(schoolRequest.getSchoolName());
        school.setEmail(schoolRequest.getEmail());
        return schoolRepository.save(school);
    }
}
