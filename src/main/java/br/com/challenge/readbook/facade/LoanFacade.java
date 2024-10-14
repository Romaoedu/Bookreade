package br.com.challenge.readbook.facade;

import br.com.challenge.readbook.entity.LoanEntity;
import br.com.challenge.readbook.entityDto.LoanEntityDTO;
import br.com.challenge.readbook.mapper.LoanMapper;
import br.com.challenge.readbook.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoanFacade {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private LoanMapper loanMapper;


    public LoanEntity createLoan (LoanEntityDTO loanDTO){

        LoanEntity loanEntity = loanMapper.toLoanEntity(loanDTO);
        return loanRepository.save(loanEntity);
    }

    public List<LoanEntity> listAllLoan(){ return loanRepository.findAll();}

    public LoanEntity updateLoan(LoanEntity loan){

        return loanRepository.saveAndFlush(loan);
    }

    public void deleteLoan(Long id) { loanRepository.deleteById(id);}

    public LoanEntity findLoanById(Long id) { return loanRepository.findById(id).orElse(null);}
}
