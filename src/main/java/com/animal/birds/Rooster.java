package com.animal.birds;

import com.animal.base.Bird;

public class Rooster extends Bird
{

    public Rooster() {
        super();
        setName("Rooster");
        System.out.println("[Rooster] Properties :: "+toString());
    }

    @Override
    public void sing() {

        System.out.println("[Rooster] Cock-a-doodle-doo");
    }

}
