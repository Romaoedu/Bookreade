package br.com.challenge.readbook.controller;



import br.com.challenge.readbook.entityDto.LoanEntityDTO;

import br.com.challenge.readbook.entity.LoanEntity;
import br.com.challenge.readbook.facade.LoanFacade;
import br.com.challenge.readbook.mapper.LoanMapper;
import br.com.challenge.readbook.repository.AuthorRepository;
import br.com.challenge.readbook.repository.ExemplarRepository;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class LoanController {

    @Autowired
private final LoanMapper loanMapper;


    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    ExemplarRepository exemplarRepository;

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
