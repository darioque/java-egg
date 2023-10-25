package com.jpa.DAO;

import java.util.List;

import com.jpa.entities.Author;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AuthorDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("library-app");
    private EntityManager em = emf.createEntityManager();

    public Author saveAuthor(Author author) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(author);
            em.getTransaction().commit();

            return author;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public Author modifyAuthor(Author author) throws Exception {

        try {

            em.getTransaction().begin();
            em.merge(author);
            em.getTransaction().commit();

            return author;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public Author removeAuthor(Author author) throws Exception {

        try {

            em.getTransaction().begin();
            em.remove(author);
            em.getTransaction().commit();

            return author;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public List<Author> showAuthors() throws Exception {

        try {
            List<Author> authors = em.createQuery("SELECT * FROM Author a").getResultList();

            System.out.println("Authors: " + authors);
            return authors;
        } catch (Exception e) {
            throw new Exception();
        }

    }

    public Author findAuthorById(Integer id) throws Exception {
        try {
            Author author = em.find(Author.class, id);
            return author;
        } catch (Exception e) {
            return null;
        }
    }

    public Author findAuthorByName(String name) throws Exception {
        try {
            Author author = (Author) em.createQuery("SELECT a FROM Author a WHERE a.name = :name")
                    .setParameter("name", name)
                    .getSingleResult();
            return author;
        } catch (Exception e) {
            return null;
        }
    }
}
