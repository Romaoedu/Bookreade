package br.com.challenge.readbook.mapper;

import br.com.challenge.readbook.dto.ReaderDto;
import br.com.challenge.readbook.entity.ReaderEntity;
import br.com.challenge.readbook.entityDto.ReaderEntityDTO;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(ReaderMapperDecorator.class)
public interface ReaderMapper {

    ReaderEntity toReaderEntity (ReaderEntityDTO readerDTO);
    ReaderDto toReaderDto(ReaderEntity readerEntity);
}
