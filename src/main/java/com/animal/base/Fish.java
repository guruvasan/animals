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


}
