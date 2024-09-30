package com.challenge.readbook.repository;

import com.challenge.readbook.entitys.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
