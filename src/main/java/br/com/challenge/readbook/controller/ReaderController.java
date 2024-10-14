package br.com.challenge.readbook.controller;


import br.com.challenge.readbook.entityDto.ReaderEntityDTO;
import br.com.challenge.readbook.entity.ReaderEntity;
import br.com.challenge.readbook.facade.ReaderFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
public class ReaderController {


    private ReaderFacade readerFacade;

    @PostMapping
    public ResponseEntity<ReaderEntity>createReader(@RequestBody ReaderEntityDTO readerDTO){

        ReaderEntity readerEntity = readerFacade.createReader(readerDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public void deleteReader(Long id){
        readerFacade.deleteReader(id);
    }

    @GetMapping
    public List<ReaderEntity> listAllReaders(){
        return readerFacade.listAllReaders();
   }

   @GetMapping("{id}")
    public void findReaderById(Long id){
       readerFacade.findReaderById(id);
    }

    @PutMapping
    public ReaderEntity updateReader(ReaderEntity readerEntity){
        return readerFacade.updateReader(readerEntity);
    }


}
