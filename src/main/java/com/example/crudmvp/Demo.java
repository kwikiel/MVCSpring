package com.example.crudmvp;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Foo!");
        Repository repository = new DbRepository();
        Application app = new Application(repository);
        app.start();
        app.stop();

    }
}
