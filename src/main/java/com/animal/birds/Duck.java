package com.animal.birds;

import com.activity.WaterActivity;
import com.animal.base.Bird;

public class Duck extends Bird implements WaterActivity
{

    public Duck() {
        super();
        setName("Duck");
        setSwimmable(Boolean.TRUE);
        setFlyable(Boolean.FALSE);
        System.out.println("[Duck] Properties :: "+toString());
    }

    @Override
    public void sing() {
        System.out.println("[Duck] :: Quack, quack");
    }


}
