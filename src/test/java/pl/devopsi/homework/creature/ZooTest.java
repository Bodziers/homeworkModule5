package pl.devopsi.homework.creature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ZooTest {

    Animal dragonAnimal = new Animal("Smok", 2010, Type.REPTILE);
    Animal frogAnimal = new Animal("Żaba", 2020, Type.AMPHIBIAN);
    Zoo firstZoo = new Zoo("Pierwsze zoo", 2000, new ArrayList<>());

    @Test
    void addAnimalTest() {
        //given
        //when
        firstZoo.addAnimal(dragonAnimal);
        firstZoo.addAnimal(frogAnimal);
        //then
        Assertions.assertEquals(2, firstZoo.getAnimals().size());
    }

    @Test
    void countAnimalsTest() {
        //given
        //when
        firstZoo.addAnimal(dragonAnimal);
        firstZoo.addAnimal(frogAnimal);
        //then
        Assertions.assertEquals(2, firstZoo.countAnimals());
    }

    @Test
    void getAnimalsTest() {
        //given
        String name ="Smok";
        //when
        firstZoo.addAnimal(dragonAnimal);
        //then
        Assertions.assertEquals(name, firstZoo.getAnimals().get(0).getName());
    }
}
