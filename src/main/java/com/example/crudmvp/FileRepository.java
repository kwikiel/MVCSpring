package com.example.crudmvp;

public class FileRepository implements Repository{
    public void read(){
        System.out.println("Read from file repository!");
    }

    public void save(){
        System.out.println("Saved to repository!");
    }
}
