package com.challenge.readbook.mapper;

import com.challenge.readbook.dto.LoanDto;
import com.challenge.readbook.entity.LoanEntity;
import com.challenge.readbook.dto.LoanEntityDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanMapperDecorate implements LoanMapper {

    @Autowired
   private ModelMapper modelMapper;

    @Override
    public LoanEntity toLoanEntity(LoanEntityDTO loanEntityDTO) {
        return modelMapper.map(loanEntityDTO, LoanEntity.class);
    }

    @Override
    public LoanDto toLoanDto(LoanEntity loanEntity) {
        return modelMapper.map(loanEntity, LoanDto.class);
    }
}
