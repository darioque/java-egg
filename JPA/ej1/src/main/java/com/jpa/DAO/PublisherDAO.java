package com.jpa.DAO;

import java.util.List;

import com.jpa.entities.Publisher;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PublisherDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("library-app");
    private EntityManager em = emf.createEntityManager();

    public Publisher savePublisher(Publisher publisher) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(publisher);
            em.getTransaction().commit();

            return publisher;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public Publisher modifyPublisher(Publisher publisher) throws Exception {

        try {

            em.getTransaction().begin();
            em.merge(publisher);
            em.getTransaction().commit();

            return publisher;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public Publisher removePublisher(Publisher publisher) throws Exception {

        try {

            em.getTransaction().begin();
            em.remove(publisher);
            em.getTransaction().commit();

            return publisher;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public List<Publisher> showPublishers() throws Exception {

        try {
            List<Publisher> publishers = em.createQuery("SELECT * FROM Publisher p").getResultList();

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
