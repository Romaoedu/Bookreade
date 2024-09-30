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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_loan")
public class LoanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long LoanId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reader_id")
    @JsonProperty("readerModel")
    private ReaderEntity readerModel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exemplar_id")
    @JsonProperty("exemplar")
    private ExemplarEntity exemplar;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime withdrawalDate;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime returnDate;


}
