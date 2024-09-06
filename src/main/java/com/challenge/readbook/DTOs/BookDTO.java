package com.challenge.readbook.DTOs;

import com.challenge.readbook.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

   private String description;
    private String resume;
    private Category category;

}
