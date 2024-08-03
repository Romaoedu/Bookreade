package com.challenge.readbook.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ExemplarEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     Long exemplarId;

     Long code;

     String localization;

     @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
     LocalDateTime entryDate;

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "book_id" )
     BookEntity book;

}
