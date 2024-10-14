package br.com.challenge.readbook.mapper;


import br.com.challenge.readbook.dto.AuthorDto;
import br.com.challenge.readbook.entity.AuthorEntity;
import br.com.challenge.readbook.entityDto.AuthorEntityDTO;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


import java.awt.*;

@Mapper(componentModel = "spring")
@DecoratedWith(AuthorMapperDecorator.class)
public interface AuthorMapper {

    AuthorEntity toAuthorEntity(AuthorEntityDTO authorDTO);
    AuthorDto toAuthorDto(AuthorEntity authorEntity);
}
