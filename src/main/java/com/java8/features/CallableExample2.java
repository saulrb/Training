package com.java8.features;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample2 implements Callable {

    @Override
    public Object call() throws Exception {
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(5);

        Thread.sleep(randomNumber * 1000);
        return randomNumber;
    }
}
