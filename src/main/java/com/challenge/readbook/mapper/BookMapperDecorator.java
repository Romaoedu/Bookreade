package com.challenge.readbook.mapper;

import com.challenge.readbook.dto.BookDto;
import com.challenge.readbook.entity.BookEntity;
import com.challenge.readbook.dto.BookEntityDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookMapperDecorator implements BookMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public BookEntity toBookEntity(BookEntityDTO bookDTO) {
        return modelMapper.map(bookDTO, BookEntity.class);
    }

    @Override
    public BookDto toBookDto(BookEntity bookEntity) {
        return modelMapper.map(bookEntity, BookDto.class);
    }
}
