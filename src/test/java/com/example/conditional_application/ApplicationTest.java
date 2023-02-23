package com.example.conditional_application;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {

    private static final GenericContainer<?> myAppFirst = new GenericContainer<>("devapp");

    private static final GenericContainer<?> myAppSecond = new GenericContainer<>("prodapp");
    @Autowired
    TestRestTemplate restTemplate;

    @BeforeAll
    public static void setUp() {
        myAppFirst.start();
        myAppSecond.start();
    }

    @Test
    void contextLoads() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:" + myAppFirst.getMappedPort(8080), String.class);
        System.out.println(forEntity.getBody());
    }
}
