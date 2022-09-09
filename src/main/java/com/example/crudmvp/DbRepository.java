package com.example.crudmvp;

import org.springframework.stereotype.Component;


@Component("DbRepo")
public class DbRepository implements Repository {
    DbRepository(){
        System.out.println("Created DB Repository");
    }
    public void read(){
        System.out.println("Read from DB mock");
    }

    public void save(){
        System.out.println("Saved to DB mock!");
    }
}
