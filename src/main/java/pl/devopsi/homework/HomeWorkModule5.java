package pl.devopsi.homework;

import pl.devopsi.homework.array.CollectionAndLoop;
import pl.devopsi.homework.variable.Variable;

public class HomeWorkModule5 {

    public static void main(String[] args) {

        System.out.println("Zmienne");

        //Variable class declaration
        Variable variable = new Variable();
        variable.printValuesToConsole();

        //Variable class with lambda
        System.out.println("***** *** Variables with lambda function ***** ***");
        variable.printFieldsToConsoleFromWithLambda();

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

        


    }
}
