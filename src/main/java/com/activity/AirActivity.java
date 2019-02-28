package com.activity;

public interface AirActivity extends Activity {

    default void fly() {
        System.out.println("[AirActivity] I am flying.");
    }


}
