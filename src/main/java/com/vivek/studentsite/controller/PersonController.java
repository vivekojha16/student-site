package com.vivek.studentsite.controller;

import com.vivek.studentsite.model.Student;
import com.vivek.studentsite.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    @GetMapping
    public List<Student> getAll() {
        return personRepository.findAll();
    }
}
