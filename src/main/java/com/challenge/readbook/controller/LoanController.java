package com.challenge.readbook.controller;


import com.challenge.readbook.dto.LoanEntityDTO;

import com.challenge.readbook.entity.LoanEntity;
import com.challenge.readbook.facade.LoanFacade;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/loan")
public class LoanController {



    @Autowired
    private LoanFacade loanFacade;


    @PostMapping
    public ResponseEntity<LoanEntity> createLoan (@RequestBody LoanEntityDTO loanDTO){

        LoanEntity savedLoan = loanFacade.createLoan(loanDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public void updateLoan(@RequestBody LoanEntity loan){
        loanFacade.updateLoan(loan);

    }

    @GetMapping
    public List<LoanEntity> searchLoan(){
        return loanFacade.listAllLoan();
    }


    @GetMapping("{id}")
    public Optional<LoanEntity> searchLoan(Long code){
        return Optional.ofNullable(loanFacade.findLoanById(code));
    }

    @DeleteMapping
    public void deleteLoan(Long code){
        loanFacade.deleteLoan(code);
    }

}