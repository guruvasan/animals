package com.animal.base;

import com.activity.LandActivity;
import com.activity.WaterActivity;

public class Frog extends Animal implements WaterActivity, LandActivity
{
    public Frog() {
        setName("Frog");
        setFlyable(Boolean.FALSE);
        setSingable(Boolean.FALSE);
        setWalkable(Boolean.TRUE);
        setSwimmable(Boolean.TRUE); // Cats hate Swimming :)
        System.out.println("[Frog] Default Properties :: "+toString());
    }
}
