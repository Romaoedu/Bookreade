package br.com.challenge.readbook.facade;

import br.com.challenge.readbook.entity.ExemplarEntity;
import br.com.challenge.readbook.entity.LoanEntity;
import br.com.challenge.readbook.entityDto.ExemplarEntityDTO;
import br.com.challenge.readbook.entityDto.LoanEntityDTO;
import br.com.challenge.readbook.mapper.ExemplarMapper;
import br.com.challenge.readbook.repository.ExemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExemplarFacade {

    @Autowired
    private ExemplarRepository exemplarRepository;

    @Autowired
    private ExemplarMapper exemplarMapper;


    public ExemplarEntity createExemplar (ExemplarEntityDTO exemplarEntityDTO){
        ExemplarEntity exemplarEntity = exemplarMapper.toExemplarEntity(exemplarEntityDTO);

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
