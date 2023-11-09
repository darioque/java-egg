package com.darioque.spring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.darioque.spring1.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {
    
}
