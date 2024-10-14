package br.com.challenge.readbook.repository;

import br.com.challenge.readbook.entity.ReaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<ReaderEntity, Long> {
}
