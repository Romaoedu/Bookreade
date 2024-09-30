package com.challenge.readbook.controller;


import com.challenge.readbook.DTOs.*;
import com.challenge.readbook.entitys.*;
import com.challenge.readbook.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class LoanController {

    @Autowired
    private final Mapper mapper;

    @Autowired
    LoanRepository loanRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    ExemplarRepository exemplarRepository;

    @Autowired
    ReaderRepository readerRepository;

    private final Mapper bookMapper;



    @PostMapping("/book")
   public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO){

        // Converter BookDTO para BookEntity e depois salvar utilizando o mapper
        BookEntity bookEntity = mapper.toBookEntity(bookDTO);
        BookEntity savedBook = bookRepository.save(bookEntity);

        return ResponseEntity.created(URI.create("/api/" + String.valueOf(savedBook.getBookId()))).body(bookDTO);
    }

    @PostMapping("/author")
    public ResponseEntity<AuthorDTO>createAuthor(@RequestBody AuthorDTO authorDTO){

        AuthorEntity authorEntity = mapper.toAuthorEntity(authorDTO);
        AuthorEntity saveAuthor = authorRepository.save(authorEntity);

        return ResponseEntity.created((URI.create("/api/" + String.valueOf(saveAuthor.getAuthorId())))).body(authorDTO);

    }


    @PostMapping("/exemplar")
    public ResponseEntity<ExemplarDTO> createExemplar(@RequestBody ExemplarDTO exemplarDTO) {
        ExemplarEntity exemplarEntity = mapper.toExemplarEntity(exemplarDTO);
        ExemplarEntity savedExemplar = exemplarRepository.save(exemplarEntity);

        return ResponseEntity.created((URI.create("/api/" + String.valueOf(savedExemplar.getExemplarId())))).body(exemplarDTO);
    }

    @PostMapping("/reader")
    public ResponseEntity<ReaderDTO>createReader(@RequestBody ReaderDTO readerDTO){

        ReaderEntity readerEntity = mapper.toReaderEntity(readerDTO);
        ReaderEntity savedReader = readerRepository.save(readerEntity);

        return ResponseEntity.created((URI.create("/api/" + String.valueOf(savedReader.getReaderId())))).body(readerDTO);
    }

    @PostMapping
    public ResponseEntity<LoanDTO> createLoan (@RequestBody LoanDTO loanDTO){

        // Converter loanDTO para loanentity e depois salvar utilizando o mapper
        LoanEntity loanEntity = mapper.toLoanEntity(loanDTO);
        LoanEntity savedLoan = loanRepository.save(loanEntity);

        return ResponseEntity.created(URI.create("/api/" + String.valueOf(savedLoan.getLoanId())))
                .body(loanDTO);
    }

    @PutMapping
    public void updateLoan(@RequestBody LoanEntity loan){
        loanRepository.saveAndFlush(loan);

    }

    @GetMapping
    public List<LoanEntity> searchLoan(){
        return loanRepository.findAll();
    }


    @GetMapping("{id}")
    public Optional<LoanEntity> searchLoan(Long code){
        return loanRepository.findById(code);
    }

    @DeleteMapping
    public void deleteLoan(Long code){
        loanRepository.deleteById(code);
    }

}
