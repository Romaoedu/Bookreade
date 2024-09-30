package com.challenge.readbook.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReaderDTO {

    String name;
    String address;
    String cpf;
}
