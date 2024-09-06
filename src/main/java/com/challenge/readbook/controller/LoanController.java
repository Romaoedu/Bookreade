package com.challenge.readbook.controller;


import com.challenge.readbook.DTOs.LoanDTO;
import com.challenge.readbook.entitys.*;
import com.challenge.readbook.repository.LoanRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class LoanController {

    @Autowired
    LoanRepository loanRepository;

    private final LoanMapper loanMapper;

    @Autowired
    public LoanController (LoanMapper loanMapper){
        this.loanMapper = loanMapper;
    }



    @PostMapping
    public ResponseEntity<LoanDTO> createLoan (@RequestBody LoanDTO loanDTO){

        // Converter LoanDTO para Loan utilizando o mapper
        LoanEntity loanEntity = loanMapper.toLoan(loanDTO);

        // Salvar o empréstimo no banco de dados
        LoanEntity savedLoan = loanRepository.save(loanEntity);

        // Converter o empréstimo salvo de volta para LoanDTO
        LoanDTO savedLoanDTO = loanMapper.toLoanDTO(savedLoan);

        return ResponseEntity.created(URI.create("/api/" + String.valueOf(savedLoan.getLoanId())))
                .body(savedLoanDTO);
    }

    @PutMapping
    public void updateLoan(@RequestBody LoanEntity loan){
        loanRepository.saveAndFlush(loan);

    }

    @GetMapping
    public List<LoanEntity> searchLoan(){
        return loanRepository.findAll();
    }


    @GetMapping("{id}")
    public Optional<LoanEntity> searchLoan(Long code){
        return loanRepository.findById(code);
    }

    @DeleteMapping
    public void deleteLoan(Long code){
        loanRepository.deleteById(code);
    }

}
