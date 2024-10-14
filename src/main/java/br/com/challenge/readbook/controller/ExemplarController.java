package br.com.challenge.readbook.controller;

import br.com.challenge.readbook.entity.ExemplarEntity;
import br.com.challenge.readbook.entityDto.ExemplarEntityDTO;
import br.com.challenge.readbook.facade.ExemplarFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exemplar")
public class ExemplarController {

    private ExemplarFacade exemplarFacade;

    @PostMapping
    public ResponseEntity<ExemplarEntity> createExemplar(@RequestBody ExemplarEntityDTO exemplarEntityDTO) {

        ExemplarEntity exemplarEntity = exemplarFacade.createExemplar(exemplarEntityDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public void deleteExemplar(Long id){
        exemplarFacade.deleteExemplar(id);
    }

    @GetMapping
    public List<ExemplarEntity> listAllExemplars(){
        return exemplarFacade.listAllExemplars();
    }

    @GetMapping("{id}")
    public void findExemplarById(Long id){
        exemplarFacade.findExemplarById(id);
    }

    public ExemplarEntity updateExemplar(ExemplarEntity exemplarEntity){
        return exemplarFacade.updateExemplar(exemplarEntity);
    }



}



