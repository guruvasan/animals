package com.activity;

public interface LandActivity extends Activity {

    default void walk() {
        System.out.println("I am walking.");
    }
}
