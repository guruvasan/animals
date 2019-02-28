package com.animal.birds;

import com.animal.base.Bird;
import lombok.Getter;
import lombok.Setter;

public class Chicken extends Bird
{
    @Getter
    @Setter
    private Rooster rooster;

    public Chicken() {
        super();
        setName("Chicken");
        setFlyable(Boolean.FALSE);
        System.out.println("[Chicken] Properties :: "+toString());
    }

    public Chicken(Rooster rooster) {
        this();
        this.rooster = rooster;
    }



    @Override
    public void sing() {
        if (rooster!=null) {
            rooster.sing();
            return;
        }
        System.out.println("[Chicken] :: Cluck, cluck");
    }

    @Override
    public void fly() {
        System.out.println("[Chicken] :: I CANNOT FLY!!!");
    }

}
