package com.animal.fishes;

import com.animal.base.Fish;

public class ClownFish extends Fish
{

    public ClownFish() {
        super();
        setName("ClownFish");
        setLarge(Boolean.FALSE);
        setColourFull(Boolean.TRUE);
        setEatOtherFishes(Boolean.FALSE);
        setMakesJokes(Boolean.TRUE);
        System.out.println("[ClownFish] Properties :: "+ super.toString());
    }
}
