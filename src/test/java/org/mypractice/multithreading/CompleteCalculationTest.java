package org.mypractice.multithreading;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CompleteCalculationTest {

    static CompleteCalculation completeCalculation;

    @BeforeAll
    public static void setUp(){
        completeCalculation = new CompleteCalculation();
    }

    @Test
    public void testCalculateResult() {
        BigInteger base1 = new BigInteger("8");
        BigInteger base2 = new BigInteger("2");
        BigInteger power1 = new BigInteger("4");
        BigInteger power2 = new BigInteger("4");
        BigInteger result = new BigInteger("40");
        assertTrue(result.equals(completeCalculation.calculateResult(base1,power1,base2,power2)));
    }


}