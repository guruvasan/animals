package com.controller;

import com.animal.base.*;
import com.animal.birds.Chicken;
import com.animal.birds.Duck;
import com.animal.birds.Parrot;
import com.animal.birds.Rooster;
import com.animal.fishes.ClownFish;
import com.animal.fishes.Shark;
import com.animal.insects.Butterfly;
import com.animal.insects.stage.ButterFlyStage;
import com.main.CountingAnimals;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AnimalController
{

    @RequestMapping(method = RequestMethod.GET,value = "/animals")
    public Map<String,List<String>> getAnimals() {

        Animal[] animals = createArrayOfAnimals();

        List<String> animalList  = new ArrayList<>();
        for (Animal animal:animals) {
            animalList.add(animal.getName());
        }

        animalList.sort(null);
        Map response = new HashMap();
        response.put("response",animalList);
        return response;
    }


    @RequestMapping(method = RequestMethod.GET,value = "/animal/{animal}")
    public Animal getAnimal(@PathVariable("animal") String animal) {
        Animal[] animals = createArrayOfAnimals();
        for (Animal ani:animals) {
            if(animal.equalsIgnoreCase(ani.getName())) {
                return ani;
            }
        }

        return new Animal();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/animals/count")
    public List<Map<String,Object>> getCount() {
        Animal[] animals = createArrayOfAnimals();
        return CountingAnimals.getAnimalDetails(animals);
    }

    private Animal[] createArrayOfAnimals() {
        return new Animal[]{
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
    }
}
