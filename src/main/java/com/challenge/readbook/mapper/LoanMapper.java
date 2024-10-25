package com.challenge.readbook.mapper;

import com.challenge.readbook.dto.LoanDto;
import com.challenge.readbook.entity.LoanEntity;
import com.challenge.readbook.dto.LoanEntityDTO;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(LoanMapperDecorate.class)
public interface LoanMapper {


    LoanEntity toLoanEntity(LoanEntityDTO loanEntityDTO);
    LoanDto toLoanDto(LoanEntity loanEntity);

}
