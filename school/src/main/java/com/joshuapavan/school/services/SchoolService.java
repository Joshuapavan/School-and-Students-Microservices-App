package com.joshuapavan.school.services;

import com.joshuapavan.school.dto.SchoolRequest;
import com.joshuapavan.school.models.SchoolEntity;

import java.util.List;

public interface SchoolService {
    List<SchoolEntity> getAllSchools();

    SchoolEntity createSchool(SchoolRequest schoolRequest);
}
