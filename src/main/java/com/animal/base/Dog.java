package com.animal.base;

import com.activity.LandActivity;
import com.activity.WaterActivity;

public class Dog extends Animal implements LandActivity, WaterActivity
{
    public Dog() {
        setName("Dog");
        setFlyable(Boolean.FALSE);
        setSingable(Boolean.FALSE);
        setWalkable(Boolean.TRUE);
        setSwimmable(Boolean.TRUE);
        System.out.println("[Dog] Default Properties :: "+toString());
    }

    @Override
    public void sound() {
        System.out.println("[DOG] Making Sound Woof, woof");
    }
}
