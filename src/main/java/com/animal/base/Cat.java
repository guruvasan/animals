package com.animal.base;

import com.activity.LandActivity;

public class Cat extends Animal implements LandActivity
{

    public Cat() {
        setName("Cat");
        setFlyable(Boolean.FALSE);
        setSingable(Boolean.FALSE);
        setWalkable(Boolean.TRUE);
        setSwimmable(Boolean.FALSE); // Cats hate Swimming :)
        System.out.println("[Cat] Default Properties :: "+toString());
    }
}
