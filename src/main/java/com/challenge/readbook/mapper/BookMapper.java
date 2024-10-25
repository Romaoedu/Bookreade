package com.challenge.readbook.mapper;

import com.challenge.readbook.dto.BookDto;
import com.challenge.readbook.entity.BookEntity;
import com.challenge.readbook.dto.BookEntityDTO;
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

