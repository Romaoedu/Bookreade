package br.com.challenge.readbook.mapper;

import br.com.challenge.readbook.dto.LoanDto;
import br.com.challenge.readbook.entity.LoanEntity;
import br.com.challenge.readbook.entityDto.LoanEntityDTO;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(LoanMapperDecorate.class)
public interface LoanMapper {


    LoanEntity toLoanEntity(LoanEntityDTO loanDTO);
    LoanDto toLoanDto(LoanEntity loanEntity);

}
