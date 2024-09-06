package com.challenge.readbook.controller;

import com.challenge.readbook.DTOs.LoanDTO;
import com.challenge.readbook.entitys.LoanEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public LoanMapper loanMapper() {
        return new LoanMapper() {
            @Override
            public LoanEntity toLoan(LoanDTO loanDTO) {
                return null;
            }

            @Override
            public LoanDTO toLoanDTO(LoanEntity loanEntity) {
                return null;
            }
        };
    }
}

