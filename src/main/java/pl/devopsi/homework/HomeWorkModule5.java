package pl.devopsi.homework;

import pl.devopsi.homework.array.CollectionAndLoop;
import pl.devopsi.homework.gender.GenderType;
import pl.devopsi.homework.variable.Variable;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class HomeWorkModule5 {

    public static void main(String[] args) {

        System.out.println("Zmienne");

        //Variable class declaration
        Variable variable = new Variable();
        variable.printValuesToConsole();

        //Variable class with lambda
        System.out.println("***** *** Variables with lambda function ***** ***");
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
        System.out.println(gender(name));
        name = "Ewa";
        System.out.println(gender(name));




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
}
