package com.challenge.readbook.mapper;

import com.challenge.readbook.dto.ReaderDto;
import com.challenge.readbook.entity.ReaderEntity;
import com.challenge.readbook.dto.ReaderEntityDTO;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(ReaderMapperDecorator.class)
public interface ReaderMapper {

    ReaderEntity toReaderEntity (ReaderEntityDTO readerEntityDTO);
    ReaderDto toReaderDto(ReaderEntity readerEntity);
}
