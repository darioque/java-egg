package com.jpa.DAO;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DAO<T> {
    protected static final String PERSISTENCE_UNIT_NAME = "library-app";
    protected static final EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    protected static jakarta.persistence.EntityManager em = factory.createEntityManager();

    public T create(T entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        return entity;
    }

    public T update(T entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    public T delete(T entity) {
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
        return entity;
    }

    public T find(Class<T> type, Object id) {
        T entity = em.find(type, id);
        return entity;
    }
}
