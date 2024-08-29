package com.diallodev.spring_deisgn_patterns.factory;

public class Dog implements Pet {

    private String name;
    private boolean hungry;

    public Dog() {
        hungry = true;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }

    @Override
    public boolean feed() {
        return false;
    }

    @Override
    public String getType() {
        return "DOG";
    }
}
