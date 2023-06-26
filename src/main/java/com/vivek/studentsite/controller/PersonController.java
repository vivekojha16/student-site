package com.vivek.studentsite.controller;

import com.vivek.studentsite.model.Student;
import com.vivek.studentsite.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    @GetMapping("/")
    public List<Student> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getAll(@PathVariable int id) {
        return personRepository.findById(id).get();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        try {
            personRepository.deleteById(id);
            return "Studend with id - "+id+" deleted.";
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return "Error in deleting studend with id - "+id;
    }
}
