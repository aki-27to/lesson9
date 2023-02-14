package com.dai8kadai.mybatisdemo.Model;

public class Name {
   private int id;
   private String Name;

    public Name(int id, String name) {
        this.id = id;
        this.Name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
