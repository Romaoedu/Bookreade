package br.com.challenge.readbook.mapper;

import br.com.challenge.readbook.dto.AuthorDto;
import br.com.challenge.readbook.entity.AuthorEntity;
import br.com.challenge.readbook.entityDto.AuthorEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public  class AuthorMapperDecorator implements AuthorMapper {

    @Autowired
    private AuthorMapper delegate;

    @Override
    public AuthorEntity toAuthorEntity(AuthorEntityDTO authorDTO) {
        AuthorEntity authorEntity = delegate.toAuthorEntity(authorDTO);
        return authorEntity;
    }

    @Override
    public AuthorDto toAuthorDto(AuthorEntity authorEntity) {
       AuthorDto authorDto = delegate.toAuthorDto(authorEntity);

        return authorDto;
    }

}
