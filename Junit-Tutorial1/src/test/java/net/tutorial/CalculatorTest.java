package net.tutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void addTest(){

        Calculator calculator=new Calculator();
       int actual= calculator.add(10,20);

       assertEquals(30,actual);
    }

}