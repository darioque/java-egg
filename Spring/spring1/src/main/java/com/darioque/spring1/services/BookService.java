package com.darioque.spring1.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioque.spring1.entities.Author;
import com.darioque.spring1.entities.Book;
import com.darioque.spring1.entities.Publisher;
import com.darioque.spring1.exceptions.MyException;
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

    @Transactional
    public Book createBook(String isbn, String title, Integer copies, String idAuthor, String idPublisher) throws MyException {

        validate(isbn, title, copies, idAuthor, idPublisher);

        if (bookRepository.findById(isbn) != null) {
            throw new MyException("Can't create book, isbn already exists");
        }

        Book book = new Book();

        Optional<Author> responseAuthor = authorRepository.findById(idAuthor);
        Optional<Publisher> responsePublisher = publisherRepository.findById(idPublisher);

        if (!responseAuthor.isPresent() || !responsePublisher.isPresent()) {
            throw new MyException("Can't create book, author or publisher not found");
        }

        Author author = responseAuthor.get();
        Publisher publisher = responsePublisher.get();

        book.setIsbn(isbn);
        book.setTitle(title);
        book.setCopies(copies);
        book.setAdded(new Date());

        book.setAuthor(author);
        book.setPublisher(publisher);

        bookRepository.save(book);

        return book;
    }

    public Book getBook(String isbn) {
        Book book = bookRepository.findById(isbn).get();

        return book;
    }

    @Transactional
    public Book updateBook(String isbn, String title, Integer copies, String idAuthor, String idPublisher) throws MyException {

        validate(isbn, title, copies, idAuthor, idPublisher);

        Optional<Book> responseBook = bookRepository.findById(isbn);
        Optional<Author> responseAuthor = authorRepository.findById(idAuthor);
        Optional<Publisher> responsePublisher = publisherRepository.findById(idPublisher);

        if (!responseBook.isPresent() || !responseAuthor.isPresent() || !responsePublisher.isPresent()) {
            throw new MyException("Can't update book, book, author or publisher not found");
        }

        Author author = responseAuthor.get();
        Publisher publisher = responsePublisher.get();
        Book book = responseBook.get();

        book.setIsbn(isbn);
        book.setTitle(title);
        book.setCopies(copies);

        book.setAuthor(author);
        book.setPublisher(publisher);

        bookRepository.save(book);

        return book;
    }

    @Transactional
    public void deleteBook(String id) {
        Book book = bookRepository.findById(id).get();

        bookRepository.delete(book);
    }

    public List<Book> listBooks() {
        List<Book> books = new ArrayList<Book>();
        books = bookRepository.findAll();

        return books;
    }

    private void validate(String isbn, String title, Integer copies, String idAuthor, String idPublisher) throws MyException {
        if (isbn == null || isbn.isEmpty() || title == null || title.isEmpty() || copies == null || copies < 0
                || idAuthor == null || idAuthor.isEmpty() || idPublisher == null || idPublisher.isEmpty()) {
            throw new MyException("Invalid data");
        }
    }
}
