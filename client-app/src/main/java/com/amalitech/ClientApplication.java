package com.amalitech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ClientApplication
{
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @RestController
    static class TestController{
        @GetMapping("/hello")
        String hello(){
            return "Hello World!";
        }
    }
}
