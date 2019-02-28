package com.animal.insects;

import com.animal.base.Insect;

public class Butterfly extends Insect
{


    public Butterfly() {
        super();
        setName("Butterfly");
        setFlyable(Boolean.FALSE);
        System.out.println("[Butterfly]  Properties :: "+super.toString());
    }


    @Override
    public void walk() {
            System.out.println("[ButterFly]  Walking.");

    }

    @Override
    public void fly() {
            System.out.println("[ButterFly]  Can Fly :: ");
    }


    @Deprecated
    @Override
    public void sound() {
        System.err.println("[ButterFly]  Can Not Make Any Sound :: ");
    }
}
