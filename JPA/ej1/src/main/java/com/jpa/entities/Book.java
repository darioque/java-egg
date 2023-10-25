package com.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Books")
public class Book {
    @Id
    private long isbn;
    private String title;
    private Integer year;
    private Integer copy;
    private Integer loanedCopies;
    private Integer remainingCopies;
    private boolean registered;
    @OneToOne
    private Author author;
    @OneToOne
    private Publisher publisher;
}
