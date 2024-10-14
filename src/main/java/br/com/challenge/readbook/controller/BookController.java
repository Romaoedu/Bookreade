package br.com.challenge.readbook.controller;

import br.com.challenge.readbook.entityDto.BookEntityDTO;
import br.com.challenge.readbook.entity.BookEntity;
import br.com.challenge.readbook.facade.BookFacade;
import br.com.challenge.readbook.mapper.BookMapper;
import br.com.challenge.readbook.repository.ExemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
     private BookFacade bookFacade;

    @Autowired
    ExemplarRepository exemplarRepository;

    @PostMapping
    public ResponseEntity<BookEntity> createBook(@RequestBody BookEntityDTO bookDTO){
        BookEntity bookEntity = bookFacade.createBook(bookDTO);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping
    public void  deleteBook(Long id){
        bookFacade.deleteBook(id);
    }

    @GetMapping
    public List<BookEntity>listAllBooks(){
        return bookFacade.listAllBooks();
    }

    @PutMapping
    public BookEntity updateBook(@RequestBody BookEntity book){
        return bookFacade.updateBook(book);
    }

    @GetMapping("/test")
    public String test() {
        return "Olá, mundo!";
    }
}
