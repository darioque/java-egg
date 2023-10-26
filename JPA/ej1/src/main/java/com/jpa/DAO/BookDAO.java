package com.jpa.DAO;

import java.util.List;

import com.jpa.entities.Author;
import com.jpa.entities.Book;
import com.jpa.entities.Publisher;

import jakarta.persistence.TypedQuery;

public final class BookDAO extends DAO<Book> {

    public BookDAO() {
        super();
    }


    public List<Book> showBooks() throws Exception {

        try {
            TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b", Book.class);
            List<Book> books = query.getResultList();
            return books;
        } catch (Exception e) {
            throw new Exception();
        }

    }

    public Book findBookByIsbn(Long isbn) throws Exception {
        try {
            Book book = em.find(Book.class, isbn);
            return book;
        } catch (Exception e) {
            return null;
        }
    }

    public Book findBookByTitle(String title) throws Exception {
        try {
            Book book = (Book) em.createQuery("SELECT * FROM Book b where title = :title")
                    .setParameter("title", title).getSingleResult();

            return book;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Book> findBooksByYear(Integer year) throws Exception {
        try {
            TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b where year = :year", Book.class).setParameter("year", year);
            List<Book> books = query.setParameter("year", year).getResultList();

            return books;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public List<Book> findBooksByAuthor(Author author) throws Exception {
        try {
            Integer authorId = author.getId();
            TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b where author_id = :author_id", Book.class).setParameter("author_id", authorId);
            List<Book> books = query.setParameter("author_id", authorId).getResultList();
            return books;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public List<Book> findBooksByPublisher(Publisher publisher) throws Exception {
        try {
            Integer publisherId = publisher.getId();
            TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b where publisher_id = :publisher_id", Book.class).setParameter("publisher_id", publisherId);
            List<Book> books = query.setParameter("publisher_id", publisherId).getResultList();
            return books;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
