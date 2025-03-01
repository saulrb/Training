package com.java8.features;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableExample implements Callable<String> {

    private long waitTime;

    public CallableExample(int timeinMillis){
        this.waitTime = timeinMillis;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Waiting for:"+this.waitTime+" Object:"+this.toString());
        Thread.sleep(this.waitTime);
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Random random = new Random();
        Callable<String> callable = new CallableExample(random.nextInt(5));
        for(int i = 0; i < 100; i++){
            Future<String> future = executorService.submit(callable);
            list.add(future);
        }
        for(Future<String> ft : list){
            try{
                System.out.println(LocalTime.now() + "::"+ft.get());
            } catch (InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}
