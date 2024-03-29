package com.jpa.services;

import java.util.List;

import com.jpa.DAO.PublisherDAO;
import com.jpa.entities.Publisher;

public class PublisherService {
    private PublisherDAO dao = new PublisherDAO();

    public Publisher savePublisher(String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (dao.findPublisherByName(name) != null) {
            throw new IllegalArgumentException("Publisher already exists");
        }

        Publisher publisher = new Publisher();
        publisher.setName(name);
        publisher.setRegistered(true);

        return dao.create(publisher);
    }

    public void modifyPublisher(Integer id, String name) throws Exception {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        Publisher publisher = findPublisherById(id);

        if (publisher == null) {
            throw new IllegalArgumentException("Publisher does not exist");
        }

        publisher.setName(name);

        dao.update(publisher);
    }

    public void removePublisher(Integer id) throws Exception {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }

        Publisher publisher = dao.findPublisherById(id);

        if (publisher == null) {
            throw new IllegalArgumentException("Publisher does not exist");
        }

        publisher.setRegistered(false);

        dao.delete(publisher);
    }

    public Publisher findPublisherById(Integer id) throws Exception {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }

        Publisher publisher = dao.findPublisherById(id);

        if (publisher == null) {
            throw new IllegalArgumentException("Publisher does not exist");
        }

        return publisher;
    }

    public Publisher findPublisherByName(String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        Publisher publisher = dao.findPublisherByName(name);

        if (publisher == null) {
            throw new IllegalArgumentException("Publisher does not exist");
        }

        return publisher;
    }

    public void showPublishers() throws Exception {
        List<Publisher> publishers = dao.findAll(Publisher.class);

        for (Publisher publisher : publishers) {
            System.out.println(publisher.getName());
        }
    }
}
