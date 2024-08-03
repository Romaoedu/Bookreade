package com.challenge.readbook.controller;


import com.challenge.readbook.entitys.*;
import com.challenge.readbook.repository.LoanRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class LoanController {

    @Autowired
    LoanRepository loanRepository;


    @PostMapping
    public void createLoan(@RequestBody LoanEntity loan){
        loanRepository.save(loan);

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
