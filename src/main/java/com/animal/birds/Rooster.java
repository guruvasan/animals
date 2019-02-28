package com.animal.birds;

import com.animal.base.Bird;
import com.util.AnimalUtil;

import java.util.Locale;

public class Rooster extends Bird {

    public Rooster() {
        super();
        setName("Rooster");
        System.out.println("[Rooster] Properties :: "+toString());
    }

    @Override
    public void sing() {

        System.out.println("[Rooster] Cock-a-doodle-doo");
    }

    public void sing(Locale locale) {
        System.out.println("[Rooster] "+ AnimalUtil.roosterSound(locale.getDisplayLanguage()));
    }
}
