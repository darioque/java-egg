package com.jpa.services;

import java.util.List;

import com.jpa.DAO.BookDAO;
import com.jpa.entities.Author;
import com.jpa.entities.Book;
import com.jpa.entities.Publisher;

public class BookService {
    
    private BookDAO dao = new BookDAO();

    public Book saveBook(Long isbn, String title, Integer year, Integer copy, Author author, Publisher publisher) throws Exception {
        if (isbn == null) {
            throw new IllegalArgumentException("Isbn cannot be null");
        }

        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }

        if (year == null) {
            throw new IllegalArgumentException("Year cannot be null");
        }

        if (copy == null) {
            throw new IllegalArgumentException("Copy cannot be null");
        }

        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }

        if (publisher == null) {
            throw new IllegalArgumentException("Publisher cannot be null");
        }

        if (dao.findBookByIsbn(isbn) != null) {
            return dao.findBookByIsbn(isbn);
        }


        Book book = new Book();
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setYear(year);
        book.setCopy(copy);
        book.setLoanedCopies(0);
        book.setRemainingCopies(5);
        book.setRegistered(true);
        book.setAuthor(author);
        book.setPublisher(publisher);

        return dao.create(book);
    }

    public void modifyBook(Long isbn, String title, Integer year, Integer copy, Author author, Publisher publisher) throws Exception {
        if (isbn == null) {
            throw new IllegalArgumentException("Isbn cannot be null");
        }

        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }

        if (year == null) {
            throw new IllegalArgumentException("Year cannot be null");
        }

        if (copy == null) {
            throw new IllegalArgumentException("Copy cannot be null");
        }

        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }

        if (publisher == null) {
            throw new IllegalArgumentException("Publisher cannot be null");
        }


        Book book = new Book();
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setYear(year);
        book.setCopy(copy);
        book.setLoanedCopies(0);
        book.setRemainingCopies(5);
        book.setRegistered(true);
        book.setAuthor(author);
        book.setPublisher(publisher);

        dao.update(book);
    }

    public void removeBook(Long isbn) throws Exception {
        if (isbn == null) {
            throw new IllegalArgumentException("Isbn cannot be null");
        }

        Book book = dao.findBookByIsbn(isbn);

        book.setRegistered(false);

        dao.delete(book);
    }

        public void showBooks() throws Exception {
        List<Book> books = dao.showBooks();

        for (Book book : books) {
            System.out.println(book.getTitle());
        }

    }

    public Book findBookByIsbn(Long isbn) throws Exception {
        if (isbn == null) {
            throw new IllegalArgumentException("Isbn cannot be null");
        }

        return dao.findBookByIsbn(isbn);
    }

    public Book findBookByTitle(String title) throws Exception {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }

        return dao.findBookByTitle(title);
    }

    public List<Book> findBooksByYear(Integer year) throws Exception {
        if (year == null) {
            throw new IllegalArgumentException("Year cannot be null");
        }

        return dao.findBooksByYear(year);
    }

    public List<Book> findBooksByAuthor(String authorName) throws Exception {
        if (authorName == null || authorName.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }

        AuthorService authorService = new AuthorService();
        Author author = authorService.findAuthorByName(authorName);

        return dao.findBooksByAuthor(author);
    }

    public List<Book> findBooksByPublisher(String publisherName) throws Exception {
        if (publisherName == null || publisherName.trim().isEmpty()) {
            throw new IllegalArgumentException("Publisher cannot be null or empty");
        }

        PublisherService publisherService = new PublisherService();
        Publisher publisher = publisherService.findPublisherByName(publisherName);

        return dao.findBooksByPublisher(publisher);
    }

    
}
