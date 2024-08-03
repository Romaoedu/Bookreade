package com.challenge.readbook.repository;

import com.challenge.readbook.entitys.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanEntity, Long> {
}


