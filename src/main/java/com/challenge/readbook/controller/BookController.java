package com.challenge.readbook.controller;

import com.challenge.readbook.entity.BookEntity;
import com.challenge.readbook.dto.BookEntityDTO;
import com.challenge.readbook.facade.BookFacade;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    @Autowired
   private BookFacade bookService;

    @PostMapping()
    public void saveBook(BookEntityDTO bookEntityDTO){
        bookService.saveBook(bookEntityDTO);
    }

    @DeleteMapping()
    public void  deleteBook(Long id){
        bookService.deleteBook(id);
    }

    @GetMapping
    public List<BookEntity>listAllBooks(){
        return bookService.listAllBooks();
    }

    @PutMapping
    public BookEntity updateBook(@RequestBody BookEntity book){
        return bookService.updateBook(book);
    }

    @GetMapping("{id}")
    public void findById(Long id){
        bookService.findById(id);
    }


}
