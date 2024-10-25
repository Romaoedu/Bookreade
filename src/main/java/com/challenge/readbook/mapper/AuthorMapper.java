package com.challenge.readbook.mapper;

import com.challenge.readbook.dto.AuthorDto;
import com.challenge.readbook.entity.AuthorEntity;
import com.challenge.readbook.dto.AuthorEntityDTO;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(AuthorMapperDecorator.class)
public interface AuthorMapper {

    AuthorEntity toAuthorEntity(AuthorEntityDTO authorDTO);
    AuthorDto toAuthorDto(AuthorEntity authorEntity);
}