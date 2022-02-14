package pl.devopsi.homework;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.devopsi.homework.gender.GenderType;
import static org.junit.jupiter.api.Assertions.*;

class HomeWorkModule5Test {

    @Test
    @Description("Should change elements of double array to absolute values")
    void arrayToAbsoluteArrayShouldHaveSameLengthTest() {
        //given
        double[] array = {-1.2,-3,4,-5};
        //when
        double[] result = HomeWorkModule5.arrayToAbsoluteArray(array);
        //then
        assertEquals(array.length, result.length);
    }
    @Test
    @Description("Should change elements of double array to absolute values")
    void arrayToAbsoluteArrayTest() {
        //given
        double[] array = {-1.2,-3,4,-5};
        //when
        double[] result = HomeWorkModule5.arrayToAbsoluteArray(array);
        //then
        Assertions.assertEquals(1.2, result[0]);
    }

    @Test
    @Description("Should check name for gender")
    void genderNameWithEnumShouldBeMenTest() {
        //given
        String name = "Wawrzyn";
        //when
        GenderType result = HomeWorkModule5.gender(name);
        //then
        assertEquals(GenderType.MEN,result);
    }
    @Test
    @Description("Should check name for gender")
    void genderNameWithEnumShouldBeWomenTest() {
        //given
        String name = "Angelika";
        //when
        GenderType result = HomeWorkModule5.gender(name);
        //then
        assertEquals(GenderType.WOMEN,result);
    }


}
