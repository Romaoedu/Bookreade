package com.challenge.readbook.facade;

import com.challenge.readbook.dto.BookDto;
import com.challenge.readbook.entity.BookEntity;
import com.challenge.readbook.dto.BookEntityDTO;
import com.challenge.readbook.mapper.BookMapperDecorator;
import com.challenge.readbook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookFacade {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    public  BookMapperDecorator bookMapperDecorator;



    public ResponseEntity<BookDto> saveBook (@RequestBody BookEntityDTO bookEntityDTO) {
       BookEntity bookEntity = bookMapperDecorator.toBookEntity(bookEntityDTO);
       bookRepository.save(bookEntity);

        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public void findById(Long id){
        bookRepository.findById(id);
    }

    public List<BookEntity> listAllBooks(){
      return  bookRepository.findAll();
    }

    public BookEntity updateBook(@RequestBody BookEntity book){
     return  bookRepository.saveAndFlush(book);
    }
}
