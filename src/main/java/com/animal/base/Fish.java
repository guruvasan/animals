package com.animal.base;

import com.activity.WaterActivity;
import lombok.Data;

@Data
public class Fish extends Animal implements WaterActivity
{

    public Fish() {
        setName("Fish");
        setFlyable(Boolean.FALSE);
        setSingable(Boolean.FALSE);
        setSwimmable(Boolean.TRUE);
        setWalkable(Boolean.FALSE);
        System.out.println("[Fish] Default Properties :: "+toString());
    }

    private boolean isLarge;
    private boolean isColourFull;
    private boolean makesJokes;
    private boolean eatOtherFishes;

    @Override
    public String toString() {
        return "Fish{" +
                "isLarge=" + isLarge +
                ", isColourFull=" + isColourFull +
                ", makesJokes=" + makesJokes +
                ", eatOtherFishes=" + eatOtherFishes +
                '}';
    }

}
