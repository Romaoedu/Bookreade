package br.com.challenge.readbook.mapper;

import br.com.challenge.readbook.dto.LoanDto;
import br.com.challenge.readbook.entity.LoanEntity;
import br.com.challenge.readbook.entityDto.LoanEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanMapperDecorate implements LoanMapper {

    @Autowired
    private LoanMapper delegate;

    @Override
    public LoanEntity toLoanEntity(LoanEntityDTO loanDTO) {
        LoanEntity loanEntity = delegate.toLoanEntity(loanDTO);

        return loanEntity;
    }

    @Override
    public LoanDto toLoanDto(LoanEntity loanEntity) {
        LoanDto loanDto = delegate.toLoanDto(loanEntity);

        return loanDto;
    }
}
