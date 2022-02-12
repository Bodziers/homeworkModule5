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
    @Description("should return sum of elements in array ")
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
}
