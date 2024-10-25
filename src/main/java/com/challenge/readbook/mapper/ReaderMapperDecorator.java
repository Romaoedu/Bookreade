package com.challenge.readbook.mapper;

import com.challenge.readbook.dto.ReaderDto;
import com.challenge.readbook.entity.ReaderEntity;
import com.challenge.readbook.dto.ReaderEntityDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReaderMapperDecorator implements ReaderMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ReaderEntity toReaderEntity(ReaderEntityDTO readerEntityDTO) {
        return modelMapper.map(readerEntityDTO, ReaderEntity.class);
    }

    @Override
    public ReaderDto toReaderDto(ReaderEntity readerEntity) {
        return modelMapper.map(readerEntity, ReaderDto.class);
    }
}
