package br.com.challenge.readbook.mapper;

import br.com.challenge.readbook.dto.ReaderDto;
import br.com.challenge.readbook.entity.ReaderEntity;
import br.com.challenge.readbook.entityDto.ReaderEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReaderMapperDecorator implements ReaderMapper {

    @Autowired
    private ReaderMapper delegate;

    @Override
    public ReaderEntity toReaderEntity(ReaderEntityDTO readerDTO) {
        ReaderEntity readerEntity = delegate.toReaderEntity(readerDTO);
        return readerEntity;
    }

    @Override
    public ReaderDto toReaderDto(ReaderEntity readerEntity) {
        ReaderDto readerDto = delegate.toReaderDto(readerEntity);

        return readerDto;
    }
}
