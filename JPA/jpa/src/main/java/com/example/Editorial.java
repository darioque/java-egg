package com.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "editorials")

public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private boolean active;

    public Editorial createEditorial(String name) {
        jakarta.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
        EntityManager em = emf.createEntityManager();   
        Editorial e1 = new Editorial();
        e1.setName(name);
        e1.setActive(true);

        em.getTransaction().begin();
        em.persist(e1);
        em.getTransaction().commit();
        return e1;
    }
}
