package com.challenge.readbook.repository;

import com.challenge.readbook.entitys.ReaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<ReaderEntity, Long> {
}
