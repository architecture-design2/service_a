package com.practice.multimodule.a;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Listenable, Speakable {


    @Override
    public void listen() {
        System.out.println("Cat.listen");
    }

    @Override
    public void speak() {
        System.out.println("Cat.speak");
    }
}
