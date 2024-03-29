package com.jpa.services;

import java.util.List;

import com.jpa.DAO.AuthorDAO;
import com.jpa.entities.Author;

public class AuthorService {
    private AuthorDAO dao = new AuthorDAO();

    public Author saveAuthor(String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (dao.findAuthorByName(name) != null) {
            throw new IllegalArgumentException("Author already exists");
        }

        return dao.create(new Author(name));
    }

    public void modifyAuthor(Integer id, String name) throws Exception {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (dao.findAuthorByName(name) == null) {
            throw new IllegalArgumentException("Author doesn't exist");
        }

        Author author = new Author();
        author.setId(id);
        author.setName(name);

        dao.update(author);
    }

    public void removeAuthor(Integer id) throws Exception {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }

        Author author = dao.findById(Author.class, id);
        if (author == null) {
            throw new IllegalArgumentException("Author does not exist");
        }

        author.setRegistered(false);

        dao.delete(author);
    }

    public Author findAuthorById(Integer id) throws Exception {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }

        Author author = dao.findById(Author.class, id);

        return author;
    }

    public Author findAuthorByName(String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        Author author = dao.findAuthorByName(name);

        return author;
    }

    public void showAuthors() throws Exception {
        List<Author> authors = dao.findAll(Author.class);

        for (Author author : authors) {
            System.out.println(author.getName());
        }

    }

}
