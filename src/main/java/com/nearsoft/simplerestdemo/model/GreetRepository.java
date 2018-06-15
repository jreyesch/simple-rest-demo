package com.nearsoft.simplerestdemo.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface GreetRepository extends MongoRepository<Greet, String> {

    public Greet findByTo(String firstName);

}
