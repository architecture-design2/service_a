package com.practice.multimodule.a;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ABootApplication {


    public ABootApplication(List<Listenable> listenableList, List<Speakable> speakableList) {

        for (Listenable listenable : listenableList) {
            listenable.listen();
        }
        for (Speakable speakable : speakableList) {
            speakable.speak();
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(ABootApplication.class);

    }
}
