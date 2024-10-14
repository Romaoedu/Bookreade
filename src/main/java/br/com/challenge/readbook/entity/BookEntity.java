package br.com.challenge.readbook.entity;

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
@Table(name = "tb_book")
public class BookEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     private long bookId;

     private String description;

     private String resume;

     private Category category;

     @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
     private LocalDateTime publicationDate;

     @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "author_id")
     private AuthorEntity author;

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "exemplar_id")
     private ExemplarEntity exemplar;
}
