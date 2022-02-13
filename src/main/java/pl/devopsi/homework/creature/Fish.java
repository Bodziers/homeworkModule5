package pl.devopsi.homework.creature;

public class Fish extends Animal{
    Boolean saltWater;
    Boolean sweetWater;

    public Fish(String name, int yearOfBirth, Type type, Boolean saltWater, Boolean sweetWater) {
        super(name, yearOfBirth, type);
        this.saltWater = saltWater;
        this.sweetWater = sweetWater;
    }

    public Boolean getSaltWater() {
        return saltWater;
    }

    public void setSaltWater(Boolean saltWater) {
        this.saltWater = saltWater;
    }

    public Boolean getSweetWater() {
        return sweetWater;
    }

    public void setSweetWater(Boolean sweetWater) {
        this.sweetWater = sweetWater;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("bul bul");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + super.getName()  + '\'' +
                ", yearOfBirth=" + super.getYearOfBirth() +
                ", type=" + super.getType() +
                ", saltWater=" + saltWater +
                ", sweetWater=" + sweetWater +
                '}';
    }
}
