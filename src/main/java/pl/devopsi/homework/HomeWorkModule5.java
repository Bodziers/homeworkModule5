package pl.devopsi.homework;

import pl.devopsi.homework.variable.Variable;

public class HomeWorkModule5 {

    public static void main(String[] args) {

        System.out.println("Zmienne");

        //Variable class declaration
        Variable variable = new Variable();
        variable.printFiledsToConsole();

        //Variable class with lambda
        System.out.println("***** *** Variables with lambda function ***** ***");
        variable.printFieldsToConsoleFromWithLambda();

        System.out.println("\n" + "Tablice");

    }
}
