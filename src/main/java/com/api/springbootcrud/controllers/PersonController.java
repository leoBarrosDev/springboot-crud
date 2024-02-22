package com.api.springbootcrud.controllers;

import com.api.springbootcrud.dtos.PersonDto;
import com.api.springbootcrud.models.PersonModel;
import com.api.springbootcrud.services.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/person")
public class PersonController {
    final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Object> savePerson(@RequestBody @Valid PersonDto personDto) {
        var personModel = new PersonModel();
        BeanUtils.copyProperties(personDto, personModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.save(personModel));
    }
}
