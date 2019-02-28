package com.animal.base;

import com.activity.AirActivity;
import com.activity.LandActivity;

public class Insect extends Animal implements AirActivity, LandActivity
{
    public Insect() {
        setName("Insect");
        setFlyable(Boolean.TRUE);
        setSingable(Boolean.FALSE);
        setSwimmable(Boolean.FALSE);
        setWalkable(Boolean.TRUE);
        System.out.println("[Insect] Default Properties :: "+toString());
    }
}
