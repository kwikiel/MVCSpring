package com.example.crudmvp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("FileRepo")
public class FileRepository implements Repository{

    FileRepository(){
        System.out.println("Constructor created File repository automatically by Spring!!");
    }
    public void read(){
        System.out.println("Read from file repository!");
    }

    public void save(){
        System.out.println("Saved to repository!");
    }
}
