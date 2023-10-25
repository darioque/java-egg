package com.jpa.DAO;

import java.util.List;

import com.jpa.entities.Author;
import com.jpa.entities.Book;
import com.jpa.entities.Publisher;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BookDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("library-app");
    private EntityManager em = emf.createEntityManager();

    public Book saveBook(Book book) throws Exception {
        try {
            Book book1 = findBookByIsbn(book.getIsbn());
            if (book1 != null) {
                throw new Exception("Book already exists");
            }

            em.getTransaction().begin();
            em.persist(book);
            em.getTransaction().commit();

            return book;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }

    public Book modifyBook(Book book) throws Exception {

        try {

            em.getTransaction().begin();
            em.merge(book);
            em.getTransaction().commit();

            return book;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public Book removeBook(Book book) throws Exception {

        try {

            em.getTransaction().begin();
            em.remove(book);
            em.getTransaction().commit();

            return book;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public List<Book> showBooks() throws Exception {

        try {
            List<Book> books = em.createQuery("SELECT b FROM Book b").getResultList();

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
            List<Book> books = em.createQuery("SELECT * FROM Book b where year = :year")
                    .setParameter("year", year).getResultList();

            return books;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public List<Book> findBooksByAuthor(Author author) throws Exception {
        try {
            Integer authorId = author.getId();
            List<Book> books = em.createQuery("SELECT * FROM Book b where author_id = :author_id")
                    .setParameter("author_id", authorId).getResultList();

            return books;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public List<Book> findBooksByPublisher(Publisher publisher) throws Exception {
        try {
            Integer publisherId = publisher.getId();
            List<Book> books = em.createQuery("SELECT * FROM Book b where publisher_id = :publisher_id")
                    .setParameter("publisher_id", publisherId).getResultList();

            return books;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
