package com.challenge.readbook.controller;

import com.challenge.readbook.DTOs.*;
import com.challenge.readbook.entitys.*;


@org.mapstruct.Mapper
public interface Mapper {

    LoanEntity toLoanEntity(LoanDTO loanDTO);


    BookEntity toBookEntity(BookDTO bookDTO);

    AuthorEntity toAuthorEntity(AuthorDTO authorDTO);

    ExemplarEntity toExemplarEntity (ExemplarDTO exemplarDTO);

    ReaderEntity toReaderEntity (ReaderDTO readerDTO);


}
