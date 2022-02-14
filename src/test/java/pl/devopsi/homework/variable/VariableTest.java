package pl.devopsi.homework.variable;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VariableTest {
    Variable v = new Variable();


    @Test
    @Description("Method getVal_integer should return integer = 250")
    void getVal_integerShouldReturnInt250Test() {
        Assertions.assertEquals(250, v.getVal_integer());
    }

    @Test
    @Description("Method getVal_string should return not null ")
    void getVal_stringNotNullTest() {
        Assertions.assertNotNull(v.getVal_string());
    }

    @Test
    @Description("Method getVal_string should return variable ")
    void getVal_stringShouldReturnStringTest() {
        Assertions.assertEquals("Akademia jest super!", v.getVal_string());
    }


    @Test
    @Description("Method getVal_double should return variable ")
    void getVal_doubleShouldReturnDoubleTest() {
        Assertions.assertEquals(1.234555, v.getVal_double());
    }

}
