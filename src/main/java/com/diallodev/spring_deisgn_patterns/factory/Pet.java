package com.diallodev.spring_deisgn_patterns.factory;

public interface Pet {
    void setName(String name);
    String getName();
    boolean isHungry();
    boolean feed();
    String getType();
}
