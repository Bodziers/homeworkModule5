package pl.devopsi.homework.array;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionAndLoopTest {
    CollectionAndLoop collectionAndLoop = new CollectionAndLoop();


    @Test
    @Description("should return simple array with n integer elements")
    void makeSimpleArrayWithNElementsTest() {
        //given
        int noOfElements = 10;
        //when
        int[] simpleArray = collectionAndLoop.makeSimpleArray(noOfElements);
        //then
        assertEquals(noOfElements,simpleArray.length);
    }

    @Test
    @Description("should return simple array with 0 elements")
    void makeSimpleArrayWithoutElementsTest() {
        //given
        int noOfElements = 0;
        //when
        int[] simpleArray = collectionAndLoop.makeSimpleArray(noOfElements);
        //then
        assertEquals(noOfElements,simpleArray.length);
    }

    @Test
    @Description("should return sum of two elements in array ")
    void sumOfArrayWithWhileTest() {
        //given
        int[] simpleArray = {5,10};
        int sum = simpleArray[0] + simpleArray[1];
        //when
        int arraySum = collectionAndLoop.sumOfArrayWithWhile(simpleArray);
        //then
        assertEquals(sum,arraySum);
    }

    @Test
    @Description("should return sum of empty array ")
    void sumOfEmptyArrayTest() {
        //given
        int[] simpleArray = {};

        //when
        int arraySum = collectionAndLoop.sumOfArrayWithWhile(simpleArray);
        //then
        assertEquals(0,arraySum);
    }

    @Test
    @Description("should return sum of negative numbers in array ")
    void sumOfNegativeNumbersArrayWithWhileTest() {
        //given
        int[] simpleArray = {-5,-10};
        int sum = simpleArray[0] + simpleArray[1];
        //when
        int arraySum = collectionAndLoop.sumOfArrayWithWhile(simpleArray);
        //then
        assertEquals(sum,arraySum);
    }

    @Test
    @Description("should count avarage of elements in array ")
    void avarageOfArrayTest() {
        //given
        int[] array = {2,6};
        //when
        double average = collectionAndLoop.averageOfArray(array);
        //then
        assertEquals((array[0]+array[1])/array.length,average);
    }

    @Test
    @Description("should count avarage of 0 elements in array ")
    void avarageOfEmptyArrayTest() {
        //given
        int[] array = {};
        //when
        double average = collectionAndLoop.averageOfArray(array);
        //then
        assertEquals(0,average);
    }

    @Test
    @Description("should rate empty array with C char")
    void scoreResultEmptyArrayShouldGiveCTest() {
        //given
        int[] array = {};
        //when
        char result = collectionAndLoop.scoreResult(array);
        //then
        assertEquals('C', result);
    }

    @Test
    @Description("should rate given number with A char")
    void scoreResultShouldGiveATest() {
        //given
        int[] array = {4,5};
        //when
        char result = collectionAndLoop.scoreResult(array);
        //then
        assertEquals('A', result);
    }

    @Test
    @Description("should rate given number with C char")
    void scoreResultShouldGiveCTest() {
        //given
        int[] array = {1,2};
        //when
        char result = collectionAndLoop.scoreResult(array);
        //then
        assertEquals('C', result);
    }

    @Test
    @Description("should describe given C score")
    void describeResultTest() {
        //given
        char score = 'C';
        //when
        String describeResult = collectionAndLoop.describeResult(score);
        //then
        assertEquals("C=Slabo",describeResult);
    }

    @Test
    @Description("should describe no score with default description")
    void describeDifferentDefaultResultTest() {
        //given
        char score = ' ';
        //when
        String describeResult = collectionAndLoop.describeResult(score);
        //then
        assertEquals("Cos nie tak...",describeResult);
    }
}
