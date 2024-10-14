package br.com.challenge.readbook.entityDto;

import br.com.challenge.readbook.entity.AuthorEntity;
import br.com.challenge.readbook.entity.ExemplarEntity;
import br.com.challenge.readbook.entity.Category;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookEntityDTO {

   private String description;
    private String resume;
    private Category category;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime publicationDate;
    private AuthorEntity author;
    private ExemplarEntity exemplar;

}
