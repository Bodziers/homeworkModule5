package pl.devopsi.homework;

import pl.devopsi.homework.array.CollectionAndLoop;
import pl.devopsi.homework.creature.*;
import pl.devopsi.homework.gender.GenderType;
import pl.devopsi.homework.lambda.Lambda1;
import pl.devopsi.homework.lambda.Lambda2;
import pl.devopsi.homework.lambda.Lambda3;
import pl.devopsi.homework.lambda.Numbers;
import pl.devopsi.homework.variable.Variable;

import java.io.*;
import java.util.*;

public class HomeWorkModule5 {

    public static void main(String[] args) {

        System.out.println("Zmienne");

        //Variable class declaration
        Variable variable = new Variable();
        variable.printValuesToConsole();

        //Variable class with lambda
        System.out.println("***** *** Zmienne z użyciem lambdy ***** ***");
        variable.printFieldsToConsoleFromWithLambda();
        System.out.println("");
        System.out.println("***** *** Tablice i pętle ***** ***");

        //looping through array with simple foreach loop
        System.out.println("\n" + "Tablica 10 elementowa");
        CollectionAndLoop collectionAndLoop = new CollectionAndLoop();
        int[] digits = collectionAndLoop.makeSimpleArray(10);
        collectionAndLoop.iterateArrayWithForEach(digits);

        //sum of all elements in array
        System.out.println("\n" + "Suma wartości elementów tablica 500 elementowa z pętlą while : ");
        digits = collectionAndLoop.makeSimpleArray(500);
        System.out.println(collectionAndLoop.sumOfArrayWithWhile(digits));

        //print score counted from average and print result
        System.out.println("\n" + "Ocena na podstawie średniej z tablicy int : ");
        digits = collectionAndLoop.makeSimpleArray(6);
        char result = collectionAndLoop.scoreResult(digits);
        System.out.println("Średnia z tablicy " + digits.length + " elementów to : " + result);
        System.out.println(collectionAndLoop.describeResult(result));
        System.out.println("");

        //static method to change array to absolute values
        System.out.println("Wartosć bezwzględa z tablicy ");
        double[] array = {-1.2,-3,4,-5};
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("to :");
        double[] absArray = arrayToAbsoluteArray(array);
        Arrays.stream(absArray).forEach(System.out::println);

        //static method to check name for gender with enum
        System.out.println("");
        String name = "Adam";
        System.out.println("Imię " + name + " to imię");
        System.out.println(gender(name));
        name = "Ewa";
        System.out.println("Imię " + name + " to imię");
        System.out.println(gender(name));

        //Creating animalas and Zoo and using available methods
        System.out.println("");
        System.out.println("Tworzenie zwierząt :");
        Animal dragonAnimal = new Animal("Smok", 2010, Type.REPTILE);

        //use of available set methods
        dragonAnimal.setName("Jaszczur");
        dragonAnimal.setType(Type.REPTILE);
        dragonAnimal.setYearOfBirth(2011);
        System.out.println("Pierwsze zwierzę to " + dragonAnimal.getName());
        System.out.println(dragonAnimal.getName() + " urodzony w " + dragonAnimal.getYearOfBirth());
        System.out.println(dragonAnimal.getName() + " rodzina " + dragonAnimal.getType());
        System.out.print(dragonAnimal.getName() + " ma ");
        System.out.print(dragonAnimal.ageOfAnimal(dragonAnimal));
        System.out.println(" lat");

        //creating zoo with animals
        Animal frogAnimal = new Animal("Żaba", 2020, Type.AMPHIBIAN);
        Zoo firstZoo = new Zoo("Pierwsze zoo", 2000, new ArrayList<>());
        System.out.println("");
        firstZoo.addAnimal(frogAnimal);
        firstZoo.addAnimal(dragonAnimal);
        firstZoo.showInfo();
        System.out.println("Zoo ma " + firstZoo.countAnimals() + " zwierzęta");
        firstZoo.getAnimals().forEach(System.out::println);
        System.out.println("dodatkowa metoda showAnimals");
        firstZoo.showAnimals();

        //additional animals
        System.out.println("Inne zwierzęta :");
        Animal tunaAnimal = new Fish("Tuna",2020, Type.FISH, Boolean.TRUE , Boolean.FALSE);
        Animal snakeAnimal = new Snake("Viper",2019,Type.AMPHIBIAN, 20);
        System.out.println(tunaAnimal.toString());
        System.out.println(snakeAnimal.toString());
        snakeAnimal.sound();
        tunaAnimal.sound();

        //List of animals
        System.out.println();
        System.out.println("Dzwięki zwierząt na liście");
        List<Speakable> animalSounds = new ArrayList<Speakable>();
        animalSounds.add(snakeAnimal);
        animalSounds.add(tunaAnimal);
        animalSounds.forEach(Speakable::sound);

        //lambdas
        System.out.println();
        Numbers numbers = new Numbers(new int[]{-1, 2, 50, 100});
        //first lambda
        Lambda1 lambda1 = (int[] intsArray) -> {
            int sum = 0;
            for (int i = 0; i < intsArray.length; i++) {
                sum = sum + intsArray[i];
            }
            return sum;
        };
        System.out.println("Pierwsza lambda sumowanie = " + numbers.add(lambda1));
        //second lambda
        Lambda2 lambda2 = (int[] intsArray) -> lambda1.add(intsArray)/intsArray.length;
        System.out.println("Druga lambda średnia = " + numbers.avg(lambda2));
        //third lambda
        Lambda3 lambda3 = (int[] intsArray) -> {
            for (int i = 0; i < intsArray.length; i++) {
                if (intsArray[i]>2) {
                    System.out.print(intsArray[i] + ",");
                }
            }
        };
        System.out.println("Trzecia lambda wyświetlanie :");
        numbers.show(lambda3);

        //lambdas with streams
        System.out.println();
        System.out.println("Lambda z Java streams:");
        System.out.println("Pierwsza lambda");
        Lambda1 lambda1Stream = (int[] intsArray) -> Arrays.stream(intsArray).sum();
        System.out.println(numbers.add(lambda1Stream));
        System.out.println("Druga lambda");
        Lambda2 lambda2Stream = (int[] intsArray) -> numbers.add(lambda1Stream) / intsArray.length;
        System.out.println(numbers.avg(lambda2Stream));
        System.out.println("Trzecia lambda");
        Lambda3 lambda3Stream = (int[] intsArray) -> Arrays.stream(intsArray).filter(el -> el >2).forEach(System.out::println);
        numbers.show(lambda3Stream);

        //write to file
        System.out.println();
        convertAnimalsToTxt(firstZoo);

    }
    public static double[] arrayToAbsoluteArray (double[] array) {
        for (int i =0; i < array.length; i++) {
            array[i] = Math.abs(array[i]);
        }
        return array;
    }
    public static GenderType gender(String name) {
        char lastChar = name.toLowerCase(Locale.ROOT).charAt(name.length()-1);
        GenderType genderEnum;
        if (lastChar == 'a') {
            genderEnum = GenderType.WOMEN;
        } else {
            genderEnum = GenderType.MEN;
        }
        return genderEnum;
    }
    public static void convertAnimalsToTxt(Zoo zoo) {
        String pathToAnimalsFile = "src/main/resources/animals.txt";
        try {
            PrintWriter printWriter = new PrintWriter(pathToAnimalsFile);
            zoo.getAnimals().forEach(animal -> printWriter.println(animal.getName()));
            System.out.println("Animals list was write to file src/main/resources/animals.txt");
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist, creating animals.txt ");
            new File(pathToAnimalsFile);
        } catch (IOException e) {
            System.err.println("File exists, but there was IOException");
        }

    }
}
