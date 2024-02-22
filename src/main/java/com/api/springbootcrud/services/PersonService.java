package com.api.springbootcrud.services;

import com.api.springbootcrud.models.PersonModel;
import com.api.springbootcrud.repositories.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
//    @Autowired
//    PersonService personService;
    final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public PersonModel save(PersonModel personModel) {
        return personRepository.save(personModel);
    }
}
