package com.darioque.spring1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioque.spring1.entities.Author;
import com.darioque.spring1.exceptions.MyException;
import com.darioque.spring1.repositories.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;
    
    @Transactional
    public Author createAuthor(String name) throws MyException{

        if (name == null || name.isEmpty()) {
            throw new MyException("Can't create author, name is empty");
        }

        if (authorRepository.findByName(name) != null) {
            throw new MyException("Can't create author, name already exists");
        }

        Author author = new Author();

        author.setName(name);

        authorRepository.save(author);

        return author;
    }

    public Author getAuthor(String id) {
        Author author = authorRepository.findById(id).get();

        return author;
    }

    @Transactional
    public Author updateAuthor(String id, String name) throws MyException {
        Optional<Author> responseAuthor = authorRepository.findById(id);

        if (!responseAuthor.isPresent()) {
            throw new MyException("Can't update author, author not found");
        }

        Author author = responseAuthor.get();

        author.setName(name);

        authorRepository.save(author);

        return author;
    }

    @Transactional
    public void deleteAuthor(String id) {
        Author author = authorRepository.findById(id).get();

        authorRepository.delete(author);
    }

    public List<Author> listAuthors() {
        List<Author> authors = new ArrayList<Author>();
        authors = authorRepository.findAll();

        return authors;
    }
}
