package com.challenge.readbook.DTOs;

import com.challenge.readbook.entitys.AuthorEntity;
import com.challenge.readbook.entitys.ExemplarEntity;
import com.challenge.readbook.enums.Category;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

   private String description;
    private String resume;
    private Category category;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime publicationDate;
    private AuthorEntity author;
    private ExemplarEntity exemplar;

}
