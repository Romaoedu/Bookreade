package br.com.challenge.readbook.controller;


import br.com.challenge.readbook.entity.AuthorEntity;
import br.com.challenge.readbook.entityDto.AuthorEntityDTO;
import br.com.challenge.readbook.facade.AuthorFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController {


    @Autowired
    private AuthorFacade authorFacade;

    @PostMapping()
    public ResponseEntity<AuthorEntity> createAuthor(@RequestBody AuthorEntityDTO authorDTO){
        AuthorEntity saveAuthor = authorFacade.createAuthor(authorDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
    @GetMapping
    public List<AuthorEntity>listAllAuthor(){
        return authorFacade.listAllAuthor();
    }

    @PutMapping
    public AuthorEntity updateAuthor(@RequestBody AuthorEntity author){
        return authorFacade.updateAuthor(author);
    }

    @GetMapping("{id}")
    public Optional<AuthorEntity> findAuthorById(Long id){
        return Optional.ofNullable(authorFacade.findAuthorById(id));
    }

    @DeleteMapping
    public void deleteAuthor(Long id){
        authorFacade.deleteAuthor(id);
    }
}
