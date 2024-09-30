package com.challenge.readbook.repository;

import com.challenge.readbook.entitys.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}