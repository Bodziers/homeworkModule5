package pl.devopsi.homework.creature;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int yearOfBirth, Type type, String breed) {
        super(name, yearOfBirth, type);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

