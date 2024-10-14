package br.com.challenge.readbook.facade;

import br.com.challenge.readbook.entity.AuthorEntity;
import br.com.challenge.readbook.entityDto.AuthorEntityDTO;
import br.com.challenge.readbook.mapper.AuthorMapper;
import br.com.challenge.readbook.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorFacade {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    public AuthorEntity createAuthor(AuthorEntityDTO authorDTO) {
        AuthorEntity authorEntity = authorMapper.toAuthorEntity(authorDTO);

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
