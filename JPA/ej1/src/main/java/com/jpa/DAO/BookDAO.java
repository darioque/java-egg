package com.jpa.DAO;

import java.util.List;

import com.jpa.entities.Author;
import com.jpa.entities.Book;
import com.jpa.entities.Publisher;

import jakarta.persistence.TypedQuery;

public final class BookDAO extends DAO<Book> {

    public Book findBookByTitle(String title) throws Exception {
        try {
            Book book = em.createQuery("SELECT b FROM Book b where title = :title", Book.class)
                    .setParameter("title", title).getSingleResult();
            return book;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Book> findBooksByYear(Integer year) throws Exception {
        try {
            TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b where year = :year", Book.class);
            List<Book> books = query.setParameter("year", year).getResultList();

            return books;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public List<Book> findBooksByAuthor(Author author) throws Exception {
        try {
            Integer authorId = author.getId();
            TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.author.id = :authorId", Book.class);
            query.setParameter("authorId", authorId);
            List<Book> books = query.getResultList();
            return books;
        } catch (Exception e) {
            throw new Exception("Error while finding books by author: " + e.getMessage());
        }
    }

    public List<Book> findBooksByPublisher(Publisher publisher) throws Exception {
        try {
            Integer publisherId = publisher.getId();
            TypedQuery<Book> query = em
                    .createQuery("SELECT b FROM Book b where b.publisher.id = :publisher_id", Book.class)
                    .setParameter("publisher_id", publisherId);
            List<Book> books = query.setParameter("publisher_id", publisherId).getResultList();
            return books;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
