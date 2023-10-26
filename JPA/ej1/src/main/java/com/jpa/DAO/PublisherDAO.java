package com.jpa.DAO;

import com.jpa.entities.Publisher;

public final class PublisherDAO extends DAO<Publisher> {

    public PublisherDAO() {
        super();
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
