package com.java8.features;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

public class CallableFutureTest {
    public static void main(String[] args) throws Exception{
        FutureTask[] randomNumberTasks = new FutureTask[5];

        for(int i = 0; i < 5; i++) {
            Callable callable = new CallableExample2();

            randomNumberTasks[i] = new FutureTask(callable);

            Thread t = new Thread(randomNumberTasks[i]);
            t.start();
        }
        Stream<Integer> stream = Stream.of(0,1,2,3,4);
        stream.forEach(item -> {
            try {
                System.out.println(randomNumberTasks[item].get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        } );
    }
}
