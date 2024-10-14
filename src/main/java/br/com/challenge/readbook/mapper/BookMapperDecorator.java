package br.com.challenge.readbook.mapper;

import br.com.challenge.readbook.dto.BookDto;
import br.com.challenge.readbook.entity.BookEntity;
import br.com.challenge.readbook.entityDto.BookEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class BookMapperDecorator implements BookMapper {

    @Autowired
    private BookMapper delegate;

    @Override
    public BookEntity toBookEntity(BookEntityDTO bookDTO) {
        BookEntity bookEntity = delegate.toBookEntity(bookDTO);

        return bookEntity;
    }

    @Override
    public BookDto toBookDto(BookEntity bookEntity) {
        BookDto bookDto = delegate.toBookDto(bookEntity);

        return bookDto;
    }
}
