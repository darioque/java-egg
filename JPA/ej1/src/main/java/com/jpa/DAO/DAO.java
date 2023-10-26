package com.jpa.DAO;

import java.util.List;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class DAO<T> {
    protected static final String PERSISTENCE_UNIT_NAME = "library-app";
    protected static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    protected static jakarta.persistence.EntityManager em = FACTORY.createEntityManager();

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

    public T findById(Class<T> type, Object id) {
        T entity = em.find(type, id);
        return entity;
    }

    public List<T> findAll(Class<T> type) {
        TypedQuery<T> query = em.createQuery("SELECT e FROM " + type.getName() + " e", type);
        List<T> entities = query.getResultList();
        return entities;
    }


}
