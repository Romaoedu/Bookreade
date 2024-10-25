package com.challenge.readbook.facade;

import com.challenge.readbook.entity.ExemplarEntity;
import com.challenge.readbook.dto.ExemplarEntityDTO;
import com.challenge.readbook.mapper.ExemplarMapperDecorator;
import com.challenge.readbook.repository.ExemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExemplarFacade {

    @Autowired
    private ExemplarRepository exemplarRepository;

    @Autowired
    private ExemplarMapperDecorator exemplarMapperDecorator;


    public ExemplarEntity createExemplar (ExemplarEntityDTO exemplarEntityDTO){
        ExemplarEntity exemplarEntity = exemplarMapperDecorator.toExemplarEntity(exemplarEntityDTO);

        return exemplarRepository.save(exemplarEntity);
    }

    public List<ExemplarEntity> listAllExemplars(){
        return exemplarRepository.findAll();
    }

    public ExemplarEntity updateExemplar(ExemplarEntity exemplarEntity){

        return exemplarRepository.saveAndFlush(exemplarEntity);
    }

    public void deleteExemplar(Long id){
        exemplarRepository.deleteById(id);
    }

    public ExemplarEntity findExemplarById(Long id){
        return exemplarRepository.findById(id).orElse(null);
    }
}
