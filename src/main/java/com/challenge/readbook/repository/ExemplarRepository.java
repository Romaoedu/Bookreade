package com.challenge.readbook.repository;

import com.challenge.readbook.entitys.ExemplarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExemplarRepository extends JpaRepository<ExemplarEntity, Long> {
}
