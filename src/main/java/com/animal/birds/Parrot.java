package com.animal.birds;

import com.activity.Activity;
import com.animal.base.Bird;
import lombok.Setter;

public class Parrot extends Bird
{

    @Setter
    private Object livesNearBy;


    public Parrot() {
        super();
        setName("Parrot");
        System.out.println("[Parrot] Properties :: "+toString());
    }

    public Parrot(Object livesNearBy) {
        this();
        this.livesNearBy = livesNearBy;
    }

    @Override
    public void sing() {
        if(livesNearBy!=null) {
            singTheLearnedSound(livesNearBy);
            return;
        }
        System.out.println("[Parrot] Default Tone");
    }

    /*
    * This method will play the sound parrot has learned.
    * sing method can be removed if we can make sound as common including bird, so it will be straightforward .
    * */

    private void singTheLearnedSound(Object livesNearBy) {
        if(livesNearBy instanceof Bird) {
            ((Bird) livesNearBy).sing();
        } else if(livesNearBy instanceof Activity) {
            ((Activity)livesNearBy).sound();
        } else {
            System.err.println("Should not have Come here. Please implement the Activity");
        }
    }
}
