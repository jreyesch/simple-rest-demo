package com.nearsoft.simplerestdemo.controller;

import com.nearsoft.simplerestdemo.model.Greet;
import com.nearsoft.simplerestdemo.model.GreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @Autowired
    GreetRepository repository;

    @GetMapping("/{name}")
    public Greet sayHello(@PathVariable String name){
        return repository.findByTo(name);
    }
}
