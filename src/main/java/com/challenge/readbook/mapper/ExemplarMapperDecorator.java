package com.challenge.readbook.mapper;

import com.challenge.readbook.dto.ExemplarDto;
import com.challenge.readbook.entity.ExemplarEntity;
import com.challenge.readbook.dto.ExemplarEntityDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExemplarMapperDecorator implements ExemplarMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ExemplarEntity toExemplarEntity(ExemplarEntityDTO exemplarDTO) {
        return modelMapper.map(exemplarDTO, ExemplarEntity.class);
    }

    @Override
    public ExemplarDto toExemplarDto(ExemplarEntity exemplarEntity){
        return modelMapper.map(exemplarEntity, ExemplarDto.class);
    }
}
