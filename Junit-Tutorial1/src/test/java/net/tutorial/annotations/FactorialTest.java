package net.tutorial.annotations;

import net.tutorial.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void factorialTest(){
        Factorial factorial=new Factorial();

        int actualresult=  factorial.factorial(5);
        assertEquals(120,actualresult);
    }

}