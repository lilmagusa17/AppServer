package org.example.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {


    public String sayHello() {
        return "Hello Service Says hello";
    }
}
