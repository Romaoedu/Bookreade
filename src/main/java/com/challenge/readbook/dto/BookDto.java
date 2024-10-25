package com.challenge.readbook.dto;

import com.challenge.readbook.entity.AuthorEntity;
import com.challenge.readbook.entity.ExemplarEntity;
import com.challenge.readbook.entity.Category;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

   private String description;
    private String resume;
    private Category category;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime publicationDate;
    private AuthorEntity author;
    private ExemplarEntity exemplar;

}
