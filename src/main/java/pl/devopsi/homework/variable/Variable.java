package pl.devopsi.homework.variable;

import java.util.function.Supplier;

public class Variable {
    private final int val_integer = 250;
    private final String val_string = "Akademia jest super!";
    private final double val_dauble = 1.234555;

    public void printFiledsToConsole() {
        System.out.println("Zmienna integer ma wartość " + getVal_integer());
        System.out.println("Zmienna String ma wartość " + getVal_string());
        System.out.println("Zmienna double ma wartość " + getVal_dauble());
    }

    public void printFieldsToConsoleFromWithLambda() {
        System.out.println(zadanie.get());
    }

    Supplier<String> zadanie = () ->
                "Zmienna integer ma wartość " + getVal_integer() + "\n"
              + "Zmienna String ma wartość " + getVal_string()+ "\n"
              + "Zmienna double ma wartość " + getVal_dauble();

    public int getVal_integer() {
        return val_integer;
    }

    public String getVal_string() {
        return val_string;
    }

    public double getVal_dauble() {
        return val_dauble;
    }

}
