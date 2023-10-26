package com.jpa.DAO;

import java.util.List;

import com.jpa.entities.Author;

import jakarta.persistence.TypedQuery;


public final class AuthorDAO extends DAO<Author> {

    public List<Author> showAuthors() throws Exception {

        try {
            TypedQuery<Author> query = em.createQuery("SELECT a FROM Author a", Author.class);
            List<Author> authors = query.getResultList();
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
