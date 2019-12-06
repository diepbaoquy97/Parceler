package com.example.parceler;

import org.parceler.Parcel;

@Parcel
public class User {
    String Name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        Name = name;
        this.age = age;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
