package com.challenge.readbook.controller;

import com.challenge.readbook.DTOs.*;
import com.challenge.readbook.entitys.*;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public Mapper mappers() {

        return new Mapper() {

            @Override
            public LoanEntity toLoanEntity(LoanDTO loanDTO) {
                LoanEntity loanEntity = new LoanEntity();
                BeanUtils.copyProperties(loanDTO, loanEntity);

                return loanEntity;
            }


            @Override
            public BookEntity toBookEntity(BookDTO bookDTO) {
                BookEntity bookEntity = new BookEntity();
                BeanUtils.copyProperties(bookDTO, bookEntity);

                return bookEntity;
            }

            @Override
            public AuthorEntity toAuthorEntity(AuthorDTO authorDTO) {
                AuthorEntity authorEntity = new AuthorEntity();
                BeanUtils.copyProperties(authorDTO, authorEntity);

                return authorEntity;
            }

            @Override
            public ExemplarEntity toExemplarEntity(ExemplarDTO exemplarDTO) {
                ExemplarEntity exemplarEntity = new ExemplarEntity();
                BeanUtils.copyProperties(exemplarDTO, exemplarEntity);

                return exemplarEntity;
            }

            @Override
            public ReaderEntity toReaderEntity(ReaderDTO readerDTO) {

                ReaderEntity readerEntity = new ReaderEntity();
                BeanUtils.copyProperties(readerDTO, readerEntity);

                return readerEntity;
            }


        };
    }
}

