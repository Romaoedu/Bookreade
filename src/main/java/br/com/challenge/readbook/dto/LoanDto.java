package br.com.challenge.readbook.dto;

import br.com.challenge.readbook.entityDto.ExemplarEntityDTO;
import br.com.challenge.readbook.entityDto.ReaderEntityDTO;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class LoanDto {

    private ReaderEntityDTO reader;
    private ExemplarEntityDTO exemplar;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime withdrawalDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime returnDate;
}
