package br.com.challenge.readbook.facade;

import br.com.challenge.readbook.entity.BookEntity;
import br.com.challenge.readbook.entityDto.BookEntityDTO;
import br.com.challenge.readbook.mapper.BookMapper;
import br.com.challenge.readbook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookFacade {

    @Autowired
    private  BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    public BookEntity createBook(BookEntityDTO bookEntityDTO) {
        BookEntity bookEntity = bookMapper.toBookEntity(bookEntityDTO);

        return bookRepository.save(bookEntity);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public void findBookById(Long id) {
        bookRepository.findById(id);
    }

    public List<BookEntity> listAllBooks() {
        return bookRepository.findAll();
    }

    public BookEntity updateBook(BookEntity book) {
        return bookRepository.saveAndFlush(book);
    }
}
