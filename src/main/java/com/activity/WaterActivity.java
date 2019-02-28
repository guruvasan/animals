package com.activity;


public interface WaterActivity extends Activity {

    default void swim() {
        System.out.println("[WaterActivity] :: I m Swimming");
    }
}
