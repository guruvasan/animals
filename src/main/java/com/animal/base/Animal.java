package com.animal.base;

import lombok.Data;

@Data
public class Animal {

    private boolean flyable;
    private boolean walkable;
    private boolean singable;
    private boolean swimmable;
    private String name = "Animal";

    @Override
    public String toString() {
        return "Animal{" +
                "flyable=" + flyable +
                ", walkable=" + walkable +
                ", singable=" + singable +
                ", swimmable=" + swimmable +
                ", name=" + name +
                '}';
    }
}
