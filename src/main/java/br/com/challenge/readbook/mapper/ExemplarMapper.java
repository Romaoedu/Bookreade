package br.com.challenge.readbook.mapper;

import br.com.challenge.readbook.dto.ExemplarDTO;
import br.com.challenge.readbook.entity.ExemplarEntity;
import br.com.challenge.readbook.entityDto.ExemplarEntityDTO;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
@DecoratedWith(ExemplarMapperDecorator.class)
public interface ExemplarMapper {

    ExemplarEntity toExemplarEntity (ExemplarEntityDTO exemplarDTO);
    ExemplarDTO toExemplarDto(ExemplarEntity exemplarEntity);

}
