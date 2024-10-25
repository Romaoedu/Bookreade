package com.challenge.readbook.mapper;

import com.challenge.readbook.dto.AuthorDto;
import com.challenge.readbook.entity.AuthorEntity;
import com.challenge.readbook.dto.AuthorEntityDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class AuthorMapperDecorator implements AuthorMapper {



    @Autowired
    private ModelMapper modelMapper;



    @Override
    public AuthorEntity toAuthorEntity(AuthorEntityDTO authorDTO) {
    return modelMapper.map(authorDTO, AuthorEntity.class);

    }

    @Override
    public AuthorDto toAuthorDto(AuthorEntity authorEntity) {
        return modelMapper.map(authorEntity, AuthorDto.class);
    }
}
