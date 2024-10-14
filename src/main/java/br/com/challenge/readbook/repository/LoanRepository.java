package br.com.challenge.readbook.repository;

import br.com.challenge.readbook.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanEntity, Long> {
}


