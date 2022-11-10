package com.akojimsg.msff;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void doSomething (int number) {
        System.out.println("Doing business method...");
        System.out.println("number = " + number);
    }
}
