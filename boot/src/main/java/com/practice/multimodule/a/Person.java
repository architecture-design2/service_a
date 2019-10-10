package com.practice.multimodule.a;

import org.springframework.stereotype.Component;

@Component
public class Person implements Listenable,Speakable {
    @Override
    public void listen() {
        System.out.println("Person.listen");

    }

    @Override
    public void speak() {
        System.out.println("Person.speak");
    }
}
