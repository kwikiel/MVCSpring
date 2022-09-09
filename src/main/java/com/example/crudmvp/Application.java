package com.example.crudmvp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Application {
    private final Repository repository;

    @Autowired
    Application(@Qualifier("DbRepo") Repository repository){
        this.repository = repository;
        System.out.printf("Class: %s", repository.getClass());
        System.out.println("Application created by Spring!");
    }


    Application(){
        repository = null;
        System.out.println("another constructor");
    }
    @PostConstruct
    public void start(){
        System.out.println("Started application!");
        repository.read();
        this.stop();
    }
    public void stop(){
        System.out.println("Stopped application!");
        repository.save();
    }
}
