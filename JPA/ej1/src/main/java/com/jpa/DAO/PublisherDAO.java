package com.jpa.DAO;

import java.util.List;

import com.jpa.entities.Publisher;

import jakarta.persistence.TypedQuery;

public final class PublisherDAO extends DAO<Publisher> {

    public PublisherDAO() {
        super();
    }


    public List<Publisher> showPublishers() throws Exception {
        try {
            TypedQuery<Publisher> query = em.createQuery("SELECT p FROM Publisher p", Publisher.class);
            List<Publisher> publishers = query.getResultList();
            return publishers;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public Publisher findPublisherById(Integer id) throws Exception {
        try {
            Publisher publisher = em.find(Publisher.class, id);
            return publisher;
        } catch (Exception e) {
            return null;
        }
    }

    public Publisher findPublisherByName(String name) throws Exception {
        try {
            Publisher publisher = (Publisher) em.createQuery("SELECT p FROM Publisher p where p.name = :name")
                    .setParameter("name", name).getSingleResult();
            return publisher;
        } catch (Exception e) {
            return null;
        }
    }

}
