package br.com.challenge.readbook.facade;

import br.com.challenge.readbook.entity.ReaderEntity;
import br.com.challenge.readbook.entityDto.ReaderEntityDTO;
import br.com.challenge.readbook.mapper.ReaderMapper;
import br.com.challenge.readbook.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReaderFacade {

    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private ReaderMapper readerMapper;


    public ReaderEntity createReader(ReaderEntityDTO readerEntityDTO){
        ReaderEntity readerEntity = readerMapper.toReaderEntity(readerEntityDTO);

        return readerRepository.save(readerEntity);
        }

    public void deleteReader(Long id) {

        readerRepository.deleteById(id);
    }

    public void findReaderById(Long id) {
        readerRepository.findById(id);
    }

    public List<ReaderEntity> listAllReaders() {

        return readerRepository.findAll();
    }

    public ReaderEntity updateReader(ReaderEntity readerEntity) {

        return readerRepository.saveAndFlush(readerEntity);
    }
}
