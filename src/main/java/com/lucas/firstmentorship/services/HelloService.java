package com.lucas.firstmentorship.services;

import com.lucas.firstmentorship.model.Hello;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public Hello helloWorld() {
        Hello hello = new Hello();
        hello.setGreeting("Hello World, ");
        hello.setFirstName("Lucas ");
        hello.setLastName("Rodrigues!");
        return hello;
    }

}
