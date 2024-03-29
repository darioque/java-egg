package com.darioque.spring1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioque.spring1.entities.Publisher;
import com.darioque.spring1.exceptions.MyException;
import com.darioque.spring1.repositories.PublisherRepository;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    @Transactional
    public Publisher createPublisher(String name) throws MyException {

        if (name == null || name.isEmpty()) {
            throw new MyException("Can't create publisher, name is empty");
        }

        if (publisherRepository.findByName(name) != null) {
            throw new MyException("Can't create publisher, name already exists");
        }

        Publisher publisher = new Publisher();

        publisher.setName(name);

        publisherRepository.save(publisher);

        return publisher;
    }

    public Publisher getPublisher(String id) {
        Publisher publisher = publisherRepository.findById(id).get();

        return publisher;
    }

    @Transactional
    public Publisher updatePublisher(String id, String name) {
        Optional<Publisher> responsePublisher = publisherRepository.findById(id);

        if (!responsePublisher.isPresent()) {
            return null;
        }

        Publisher publisher = responsePublisher.get();

        publisher.setName(name);

        publisherRepository.save(publisher);

        return publisher;
    }

    @Transactional
    public void deletePublisher(String id) {
        Publisher publisher = publisherRepository.findById(id).get();

        publisherRepository.delete(publisher);
    }

    public List<Publisher> listPublishers() {
        List<Publisher> publishers = new ArrayList<Publisher>();
        publishers = publisherRepository.findAll();

        return publishers;
    }
}
