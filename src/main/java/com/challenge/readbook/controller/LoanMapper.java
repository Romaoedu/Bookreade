package com.challenge.readbook.controller;

import com.challenge.readbook.DTOs.LoanDTO;
import com.challenge.readbook.entitys.LoanEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Mapper
public interface LoanMapper {
    LoanEntity toLoan(LoanDTO loanDTO);
    LoanDTO toLoanDTO(LoanEntity loanEntity);
}
