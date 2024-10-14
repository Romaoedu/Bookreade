package br.com.challenge.readbook.repository;

import br.com.challenge.readbook.entity.ExemplarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExemplarRepository extends JpaRepository<ExemplarEntity, Long> {
}
