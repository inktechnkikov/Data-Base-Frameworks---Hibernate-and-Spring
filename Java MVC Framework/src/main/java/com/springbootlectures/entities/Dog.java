package com.springbootlectures.entities;

import com.springbootlectures.interfaces.Animal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements Animal {
    private String name;
    public Dog() {
        System.out.println("Instantiated");
    }
    @PostConstruct
    public void init(){
        System.out.println("initializing");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroying");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

