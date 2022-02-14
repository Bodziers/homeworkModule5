package pl.devopsi.homework.creature;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ZooTest {

    //given
    Animal dragonAnimal = new Animal("Smok", 2010, Type.REPTILE);
    Animal frogAnimal = new Animal("Żaba", 2020, Type.AMPHIBIAN);
    Zoo firstZoo = new Zoo("Pierwsze zoo", 2000, new ArrayList<>());

    @Test
    @Description("Should add two animals to zoo")
    void addTwoAnimalsToZooTest() {
        //given
        firstZoo.addAnimal(dragonAnimal);
        firstZoo.addAnimal(frogAnimal);
        //when
        int addedAnimals = firstZoo.getAnimals().size();
        //then
        Assertions.assertEquals(2, addedAnimals);
    }

    @Test
    @Description("should count two animals in zoo")
    void countAnimalsTest() {
        //given
        firstZoo.addAnimal(dragonAnimal);
        firstZoo.addAnimal(frogAnimal);
        //when
        int numberOfAnimalsInZoo = firstZoo.countAnimals();
        //then
        Assertions.assertEquals(2, numberOfAnimalsInZoo);
    }

    @Test
    @Description("testing receiving name of animal in zoo")
    void getAnimalsTest() {
        //given
        String name ="Smok";
        firstZoo.addAnimal(dragonAnimal);
        //when
        String result =firstZoo.getAnimals().get(0).getName();
        //then
        Assertions.assertEquals(name, result);
    }
    @Test
    @Description("testing if new zoo have animals list")
    void getEmptyAnimalsListTest() {

        //when
        int result = firstZoo.getAnimals().size();
        //then
        Assertions.assertEquals(0, result);
    }
}
