package com.jpa.DAO;

import com.jpa.entities.Author;

public final class AuthorDAO extends DAO<Author> {

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
