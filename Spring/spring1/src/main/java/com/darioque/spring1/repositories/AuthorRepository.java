package com.darioque.spring1.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.darioque.spring1.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {

    @Query("SELECT a FROM Author a WHERE a.name = :authorName")
    public Author findByName(@Param("authorName") String name);
}
