package com.animal.base;

import com.activity.WaterActivity;

public class Dolphin extends Animal implements WaterActivity
{

    public Dolphin() {
        setName("Dolphin");
        setFlyable(Boolean.FALSE);
        setSingable(Boolean.FALSE);
        setSwimmable(Boolean.TRUE);
        setWalkable(Boolean.FALSE);
        System.out.println("[Dolphin] Properties :: "+toString());
    }

}
