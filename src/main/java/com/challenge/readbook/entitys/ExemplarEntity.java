package com.challenge.readbook.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "tb_exemplar")
public class ExemplarEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     @JsonProperty("exemplarId")
    private Long exemplarId;

     @JsonProperty("code")
    private Long code;

     @JsonProperty("localization")
    private String localization;

     @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime entryDate;

}
