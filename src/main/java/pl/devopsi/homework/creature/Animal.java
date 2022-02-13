package pl.devopsi.homework.creature;

import java.util.Objects;

public class Animal implements Speakable{
    private String name;
    private int yearOfBirth;
    private Type type;
    private static int CURRENT_YEAR=2022;

    public Animal(String name, int yearOfBirth, Type type) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.type = type;
    }

    public int ageOfAnimal(Animal animal) {
        return CURRENT_YEAR - animal.getYearOfBirth();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName()) && Objects.equals(getYearOfBirth(), animal.getYearOfBirth()) && getType() == animal.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYearOfBirth(), getType());
    }

    @Override
    public void sound() {
        System.out.println("Animal Sound");
    }
}
