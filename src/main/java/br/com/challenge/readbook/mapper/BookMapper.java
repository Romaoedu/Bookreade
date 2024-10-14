package br.com.challenge.readbook.mapper;


import br.com.challenge.readbook.dto.BookDto;
import br.com.challenge.readbook.entity.BookEntity;
import br.com.challenge.readbook.entityDto.BookEntityDTO;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
@DecoratedWith(BookMapperDecorator.class)
@Component
public interface BookMapper {

    BookDto toBookDto(BookEntity bookEntity);
    BookEntity toBookEntity(BookEntityDTO bookDTO);
}


