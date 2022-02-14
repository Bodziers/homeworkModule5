package pl.devopsi.homework.creature;

import java.util.List;

public class Zoo {
    private String name;
    private int yearOfEstablishment;
    private List<Animal> animals;

    public Zoo(String name, int yearOfEstablishment, List<Animal> animals) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        this.animals.forEach(System.out::println);
    }

    public int countAnimals() {
        return this.animals.size();
    }

    private int avgAge() {
        int ageSum = 0;
        for (Animal animal : this.animals) {
            ageSum = ageSum + animal.ageOfAnimal();
        }
        return ageSum/this.countAnimals();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void showInfo() {
        System.out.println("Informacja o zoo : " + this.name + "\n"
                + "Rok założenia : " + this.yearOfEstablishment + "\n"
                + "Średni wiek zwierząt : " + this.avgAge() +" lat");
    }

}
