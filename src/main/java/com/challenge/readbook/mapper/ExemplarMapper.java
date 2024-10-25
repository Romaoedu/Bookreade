package com.challenge.readbook.mapper;


import com.challenge.readbook.dto.ExemplarDto;
import com.challenge.readbook.entity.ExemplarEntity;
import com.challenge.readbook.dto.ExemplarEntityDTO;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
@DecoratedWith(ExemplarMapperDecorator.class)
public interface ExemplarMapper {

    ExemplarEntity toExemplarEntity (ExemplarEntityDTO exemplarDTO);
    ExemplarDto toExemplarDto(ExemplarEntity exemplarEntity);

}
