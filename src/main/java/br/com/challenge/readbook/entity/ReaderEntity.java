package br.com.challenge.readbook.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_reader")
public class ReaderEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     @JsonProperty("readerId")
    private Long readerId;

     @JsonProperty("cpf")
     private String cpf;

     @Column(nullable = false)
     @JsonProperty("name")
     private String name;

     @Column(nullable = false)
     @JsonProperty("address")
     private String address;

}
