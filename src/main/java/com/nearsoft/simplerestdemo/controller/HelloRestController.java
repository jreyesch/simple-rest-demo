package com.nearsoft.simplerestdemo.controller;

import com.nearsoft.simplerestdemo.model.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/{name}")
    public Greet sayHello(@PathVariable String name){
        Greet greet = new Greet();
        greet.setTo(name);
        greet.setFrom("simple-rest-demo");
        greet.setMessage("Hello there");
        return greet;
    }
}
