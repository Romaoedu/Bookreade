package com.challenge.readbook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReaderDto {

    String name;
    String address;
    String cpf;
}
