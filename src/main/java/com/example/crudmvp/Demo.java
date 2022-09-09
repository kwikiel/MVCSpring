package com.example.crudmvp;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Foo!");
        FileRepository repository = new FileRepository(new Scanner(System.in));
        Application app = new Application(repository);
        app.start();
        app.stop();
    }
}
