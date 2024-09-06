package com.challenge.readbook.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExemplarDTO {

    private Long code;
    private String localization;
    private LocalDateTime entryDate;
}
