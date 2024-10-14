package br.com.challenge.readbook.dto;

import br.com.challenge.readbook.entity.AuthorEntity;
import br.com.challenge.readbook.entity.Category;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class BookDto {

    private String description;
    private String resume;
    private Category category;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime publicationDate;
    private AuthorEntity author;
}
