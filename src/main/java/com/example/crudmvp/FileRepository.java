package com.example.crudmvp;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component("FileRepo")
public class FileRepository implements Repository{
    private Scanner scanner;

    FileRepository(Scanner scanner){
        System.out.println("Constructor created File repository automatically by Spring!!");
        this.scanner = scanner;
    }
    public void read(){
        System.out.println("Read from file repository!");
    }

    public void save(){
        System.out.println("Saved to repository!");
    }
}
