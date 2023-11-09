package com.darioque.spring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.darioque.spring1.entities.Book;
import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, String>{

    @Query("SELECT b FROM Book b WHERE b.title = :title")
    public List<Book> findByTitle(@Param("title") String title);

    @Query("SELECT b FROM Book b WHERE b.author.name = :authorName")
    public List<Book> findByAuthorName(@Param("authorName") String authorName);
}
