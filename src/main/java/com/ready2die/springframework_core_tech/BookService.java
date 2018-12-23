package com.ready2die.springframework_core_tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class BookService {

    @Autowired @Qualifier("myBookRepository")
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository =  bookRepository;
    }

    public Book save(Book book) {
        book.setCreated(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("====================");
        System.out.println("Hello");
    }

    public void printBookRepository() {
        System.out.println(bookRepository.getClass());
    }
}
