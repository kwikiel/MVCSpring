package com.example.crudmvp;

public class DbRepository implements Repository {
    public void read(){
        System.out.println("Read from DB mock");
    }

    public void save(){
        System.out.println("Saved to DB mock!");
    }
}
