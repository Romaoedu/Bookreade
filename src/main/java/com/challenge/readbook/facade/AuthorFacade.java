package com.challenge.readbook.facade;

import com.challenge.readbook.entity.AuthorEntity;
import com.challenge.readbook.dto.AuthorEntityDTO;
import com.challenge.readbook.mapper.AuthorMapperDecorator;
import com.challenge.readbook.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorFacade {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapperDecorator authorMapperDecorator;

    public AuthorEntity createAuthor(AuthorEntityDTO authorDTO) {
        AuthorEntity authorEntity = authorMapperDecorator.toAuthorEntity(authorDTO);

        return authorRepository.save(authorEntity);
    }

    public List<AuthorEntity> listAllAuthor(){
        return authorRepository.findAll();
    }

    public AuthorEntity updateAuthor(AuthorEntity author) {
        return authorRepository.saveAndFlush(author);
    }

    public void deleteAuthor(Long id) { authorRepository.deleteById(id);}

    public AuthorEntity findAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);}
}
