package com.api.springbootcrud.services;

import com.api.springbootcrud.models.PersonModel;
import com.api.springbootcrud.repositories.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    @Transactional
    public PersonModel save(PersonModel personModel) {
        return personRepository.save(personModel);
    }

    @Transactional
    public Object findAll() {
        return personRepository.findAll();
    }
}
