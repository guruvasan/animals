package com.animal.birds;

import com.animal.base.Bird;
import lombok.Getter;
import lombok.Setter;

public class Chicken extends Bird
{

    public Chicken() {
        super();
        setName("Chicken");
        setFlyable(Boolean.FALSE);
        System.out.println("[Chicken] Properties :: "+toString());
    }


    @Override
    public void sing() {
        System.out.println("[Chicken] :: Cluck, cluck");
    }

    @Override
    public void fly() {
        System.out.println("[Chicken] :: I CANNOT FLY!!!");
    }

}
