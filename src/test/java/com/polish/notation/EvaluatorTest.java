package com.polish.notation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluatorTest {

    String [] opers1 = {"1","2","+","3","*"};
    String [] opers2 = {"4","13","5","/","+"};
    Evaluator subject;

    @BeforeEach
    void setUp() {
        subject = new Evaluator();
    }

    @Test
    void result_oper1(){
        int result = subject.evaluate(opers1);
        Assertions.assertEquals(result,9);
    }
    @Test
    void result_oper2(){
        int result = subject.evaluate(opers2);
        Assertions.assertEquals(result,6);
    }

}