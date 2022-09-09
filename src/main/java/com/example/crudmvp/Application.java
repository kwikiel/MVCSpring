package com.example.crudmvp;

public class Application {
    private Repository repository;

    Application(Repository repository){
        this.repository = repository;
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
