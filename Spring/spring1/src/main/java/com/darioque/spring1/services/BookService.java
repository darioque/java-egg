package com.darioque.spring1.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darioque.spring1.entities.Author;
import com.darioque.spring1.entities.Book;
import com.darioque.spring1.entities.Publisher;
import com.darioque.spring1.repositories.AuthorRepository;
import com.darioque.spring1.repositories.BookRepository;
import com.darioque.spring1.repositories.PublisherRepository;

@Service
public class BookService {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private PublisherRepository publisherRepository;
    @Autowired
    private BookRepository bookRepository;
    
    public Book createBook(String isbn, String title, Integer copies, String idAuthor, String idPublisher) {
        Book book = new Book();
        Author author = authorRepository.findById(idAuthor).get();
        Publisher publisher = publisherRepository.findById(idPublisher).get();

        book.setIsbn(isbn);
        book.setTitle(title);
        book.setCopies(copies);
        book.setAdded(new Date());
        
        book.setAuthor(author);
        book.setPublisher(publisher);

        bookRepository.save(book);

        return book;
    }
}
