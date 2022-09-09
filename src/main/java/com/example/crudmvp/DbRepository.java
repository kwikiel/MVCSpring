package com.example.crudmvp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component("DbRepo")
public class DbRepository implements Repository {
    @Autowired // not recommended, just a showcase of how it works
    private Scanner scanner;
    DbRepository(){
        System.out.println("Created DB Repository");

    }
    public void read(){
        System.out.println("Read from DB mock");
    }

    public void save(){
        System.out.println("Saved to DB mock!");
        System.out.println(scanner);

    }


    @Autowired // not recommended, just a showcase of how it works: injection by setter is bad, mkay
    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }
}
