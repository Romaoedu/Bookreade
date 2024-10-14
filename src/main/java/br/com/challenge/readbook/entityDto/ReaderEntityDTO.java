package br.com.challenge.readbook.entityDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReaderEntityDTO {

    private   String name;
    private String address;
    private String cpf;
}
