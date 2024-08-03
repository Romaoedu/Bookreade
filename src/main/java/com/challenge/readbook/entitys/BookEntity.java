package com.challenge.readbook.entitys;

import com.challenge.readbook.enums.Category;
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
public class BookEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     long bookId;

     String description;

     String resume;

     Category category;

     @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
     LocalDateTime publicationDate;

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "author_id")
     AuthorEntity author;
}
