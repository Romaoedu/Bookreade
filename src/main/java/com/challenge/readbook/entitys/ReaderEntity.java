package com.challenge.readbook.entitys;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ReaderEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     String readerId;

     String cpf;

     @Column(nullable = false)
     String name;

     @Column(nullable = false)
     String address;

}
