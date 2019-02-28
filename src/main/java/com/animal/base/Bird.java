package com.animal.base;

import com.activity.AirActivity;
import com.activity.LandActivity;

public  class Bird extends Animal implements AirActivity, LandActivity {


    public Bird() {
        setName("Bird");
        setFlyable(Boolean.TRUE);
        setSingable(Boolean.TRUE);
        setSwimmable(Boolean.FALSE);
        setWalkable(Boolean.TRUE);
        System.out.println("[Bird] Default Properties :: "+toString());
    }

    public void  sing() {
        System.out.println("[Bird] I am singing.");
    }


    /*
      # Deprecated the sound() method.


     */
    @Deprecated
    @Override
    public void sound() {
        System.out.println("[Bird] Please use sing() method");
    }
}
