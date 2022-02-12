package pl.devopsi.homework.array;

public class CollectionAndLoop {


    public int[] makeSimpleArray(int el) {
        int[] simpleArray = new int[el];
        for (int i = 0; i < simpleArray.length;i++) {
            simpleArray[i] = i+1;
        }
        return simpleArray;
    }

    public void iterateArrayWithForEach(int[] simpleArray) {
        for (int element:simpleArray) {
            if(element%2==0){
                System.out.println("Liczba " + element +" jest parzysta" );
            } else {
                System.out.println(element);
            }
        }
    }

    public int sumOfArrayWithWhile(int[] simpleArray) {
        int counter = 0;
        int sumOfElements = 0;
        while (counter < simpleArray.length) {
            sumOfElements = sumOfElements + simpleArray[counter];
            counter++;
        }
        return sumOfElements;
    }

    public double averageOfArray(int[] array) {
        return sumOfArrayWithWhile(array) / array.length;
    }

    public char scoreResult (int[] array) {
        double score = averageOfArray(array);
        char grade;
        if (score < 3) {
            grade = 'C';
        } else if (score >=3 && score < 4) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        return grade;
    }

    public String describeResult(char grade) {
        return switch (grade) {
            case 'A' -> "A=Super";
            case 'B' -> "B=Srednio";
            case 'C' -> "C=Slabo";
            default -> "Cos nie tak...";
        };
    }

}
