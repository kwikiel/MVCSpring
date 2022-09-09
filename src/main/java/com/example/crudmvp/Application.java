package com.example.crudmvp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Application {
    private final Repository repository;

    Application(@Qualifier("DbRepo") Repository repository){
        this.repository = repository;
        System.out.printf("Class: %s", repository.getClass());
        System.out.println("Application created by Spring!");
    }
    public void start(){
        System.out.println("Started application!");
        repository.read();

    }
    public void stop(){
        System.out.println("Stopped application!");
        repository.save();
    }
}
