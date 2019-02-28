package com.main;

import com.animal.base.*;
import com.animal.birds.Chicken;
import com.animal.birds.Duck;
import com.animal.birds.Parrot;
import com.animal.birds.Rooster;
import com.animal.fishes.ClownFish;
import com.animal.fishes.Shark;
import com.animal.insects.Butterfly;
import com.animal.insects.stage.ButterFlyStage;

import java.util.ArrayList;
import java.util.List;

public class CountingAnimals
{


    public static void main(String[] args) {

        List<String> animalsCanFly = new ArrayList<>();
        List<String> animalsCanWalk = new ArrayList<>();
        List<String> animalsCanSwim = new ArrayList<>();
        List<String> animalsCanSing = new ArrayList<>();

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Butterfly(new ButterFlyStage()),
                new Cat()
        };


        for (Animal animal:animals) {
            if(animal.isFlyable()) {
                animalsCanFly.add(animal.getClass().getSimpleName());
            }
            if(animal.isSingable()) {
                animalsCanSing.add(animal.getName());
            }
            if(animal.isSwimmable()){
                animalsCanSwim.add(animal.getName());
            }
            if(animal.isWalkable()) {
                animalsCanWalk.add(animal.getName());
            }
        }

        System.out.println("Total Number of Animals :: "+animals.length);
        System.out.println("No Of Animals Can Fly :: "+animalsCanFly.size()+" and the Animals are : "+animalsCanFly);
        System.out.println("No Of Animals Can Walk :: "+animalsCanWalk.size()+" and the Animals are : "+animalsCanWalk);
        System.out.println("No Of Animals Can Sing :: "+animalsCanSing.size()+" and the Animals are : "+animalsCanSing);
        System.out.println("No Of Animals Can Swim :: "+animalsCanSwim.size()+" and the Animals are : "+animalsCanSwim);

    }

}
