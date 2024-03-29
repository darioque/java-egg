package com.darioque.spring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.darioque.spring1.entities.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, String> {
    @Query("SELECT p FROM Publisher p WHERE p.name = :name")
    public Publisher findByName(@Param("name") String name);
}
