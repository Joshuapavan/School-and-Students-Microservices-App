package com.joshuapavan.school.repositories;

import com.joshuapavan.school.models.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<SchoolEntity, Long> {
}
