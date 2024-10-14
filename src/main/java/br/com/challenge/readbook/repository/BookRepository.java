package br.com.challenge.readbook.repository;

import br.com.challenge.readbook.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,  Long> {
}
