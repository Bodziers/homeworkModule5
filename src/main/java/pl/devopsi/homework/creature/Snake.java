package pl.devopsi.homework.creature;

public class Snake extends Animal {
    private int lenght;

    public Snake(String name, int yearOfBirth, Type type, int lenght) {
        super(name, yearOfBirth, type);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("ssssssss");
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + super.getName()  + '\'' +
                ", yearOfBirth=" + super.getYearOfBirth() +
                ", type=" + super.getType() +
                ", length=" + lenght + '\'' +
                '}';
    }
}
