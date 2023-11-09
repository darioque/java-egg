package com.darioque.spring1.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    private String isbn;
    private String title;
    private Integer copies;

    @Temporal(TemporalType.DATE)
    private Date added;

    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;
}
