package com.challenge.readbook.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_author")

public class AuthorEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   Long authorId;
   String name;

}
