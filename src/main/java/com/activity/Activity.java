package com.activity;

public interface Activity
{
    default void see() {
        System.out.println("[Activity] I am seeing.");
    }

    default void sound() {
        System.out.println("[Activity] Generating sound.");
    }
}
