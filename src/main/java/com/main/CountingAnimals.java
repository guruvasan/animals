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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingAnimals
{


    private static final String ANIMALS =  "animals";

    public static void main(String[] args) {





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


        getAnimalDetails(animals);


    }

    public static List<Map<String,Object>> getAnimalDetails(Animal[] animals) {
        List<String> animalsCanFly = new ArrayList<>();
        List<String> animalsCanWalk = new ArrayList<>();
        List<String> animalsCanSwim = new ArrayList<>();
        List<String> animalsCanSing = new ArrayList<>();


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

        animalsCanFly.sort(null);
        animalsCanWalk.sort(null);
        animalsCanSwim.sort(null);
        animalsCanSing.sort(null);

        Map<String,Object> flyingAnimalDetails = new HashMap<>();
        Map<String,Object> walkingAnimalDetails = new HashMap<>();
        Map<String,Object> swimmingAnimalDetails = new HashMap<>();
        Map<String,Object> singingAnimalDetails = new HashMap<>();

        flyingAnimalDetails.put("noOfFlyingAnimals",animalsCanFly.size()) ;
        flyingAnimalDetails.put(ANIMALS,animalsCanFly);

        walkingAnimalDetails.put("noOfWalkingAnimals",animalsCanWalk.size());
        walkingAnimalDetails.put(ANIMALS,animalsCanWalk);


        swimmingAnimalDetails.put("noOfSwimmingAnimals",animalsCanSwim.size());
        swimmingAnimalDetails.put(ANIMALS,animalsCanSwim);

        singingAnimalDetails.put("noOfSingingAnimals",animalsCanSing.size());
        singingAnimalDetails.put(ANIMALS,animalsCanSing);

        List<Map<String,Object>> animalDetails = new ArrayList<>();
        animalDetails.add(flyingAnimalDetails);
        animalDetails.add(walkingAnimalDetails);
        animalDetails.add(swimmingAnimalDetails);
        animalDetails.add(singingAnimalDetails);

        return animalDetails;
    }

}
