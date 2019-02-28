package com.animal.fishes;

import com.animal.base.Fish;

public class Shark extends Fish
{

    public Shark() {
        super();
        setName("Shark");
        setLarge(Boolean.TRUE);
        setColourFull(Boolean.FALSE);
        setEatOtherFishes(Boolean.TRUE);
        setMakesJokes(Boolean.FALSE);
        System.out.println("[Shark] Properties :: "+ super.toString());
    }
}
