package com.nearsoft.simplerestdemo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloRestControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void sayHello() {
        String expected ="{\"to\":\"Jorge\",\"from\":\"simple-rest-demo\",\"message\":\"Hello there\"}";
        String body = this.restTemplate.getForObject("/Jorge", String.class);
        assertThat(body).isEqualTo(expected);
    }

}