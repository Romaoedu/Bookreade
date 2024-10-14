package br.com.challenge.readbook.mapper;

import br.com.challenge.readbook.dto.ExemplarDTO;
import br.com.challenge.readbook.entity.ExemplarEntity;
import br.com.challenge.readbook.entityDto.ExemplarEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExemplarMapperDecorator implements ExemplarMapper {

    @Autowired
    private ExemplarMapper delegate;

    @Override
    public ExemplarEntity toExemplarEntity(ExemplarEntityDTO exemplarDTO) {
        ExemplarEntity exemplarEntity = delegate.toExemplarEntity(exemplarDTO);
        return exemplarEntity;
    }

    @Override
    public ExemplarDTO toExemplarDto(ExemplarEntity exemplarEntity){
        ExemplarDTO exemplarDTO = delegate.toExemplarDto(exemplarEntity);

        return exemplarDTO;
    }
}
