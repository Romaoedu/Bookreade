package com.challenge.readbook.DTOs;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanDTO {

    ReaderDTO readerModel;
    ExemplarDTO exemplar;
    LocalDateTime withdrawalDate;
    LocalDateTime returnDate;


}
