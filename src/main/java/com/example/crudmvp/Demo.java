package com.example.crudmvp;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Foo!");
        FileRepository repository = new FileRepository();
        Application app = new Application(repository);
        app.start();
        app.stop();

    }
}
