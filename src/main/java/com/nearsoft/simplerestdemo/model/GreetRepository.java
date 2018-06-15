package com.nearsoft.simplerestdemo.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GreetRepository extends MongoRepository<Greet, String> {

    public Greet findByTo(String firstName);

}
