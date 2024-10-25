package com.challenge.readbook.facade;

import com.challenge.readbook.entity.LoanEntity;
import com.challenge.readbook.dto.LoanEntityDTO;
import com.challenge.readbook.mapper.LoanMapperDecorate;
import com.challenge.readbook.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


    @Component
    public class LoanFacade {

        @Autowired
        private LoanRepository loanRepository;

        @Autowired
        private LoanMapperDecorate loanMapperDecorate;


        public LoanEntity createLoan (LoanEntityDTO loanEntityDTO){

            LoanEntity loanEntity = loanMapperDecorate.toLoanEntity(loanEntityDTO);
            return loanRepository.save(loanEntity);
        }

        public List<LoanEntity> listAllLoan(){ return loanRepository.findAll();}

        public LoanEntity updateLoan(LoanEntity loan){

            return loanRepository.saveAndFlush(loan);
        }

        public void deleteLoan(Long id) { loanRepository.deleteById(id);}

        public LoanEntity findLoanById(Long id) { return loanRepository.findById(id).orElse(null);}

    }
