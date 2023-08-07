package com.java8.features;

import java.util.concurrent.*;

public class FutureTaskExample {
    public static void main(String[] args) {
        CallableExample callableExample1 = new CallableExample(1000);
        CallableExample callableExample2 = new CallableExample(2000);
        FutureTask<String> futureTask1 = new FutureTask<String>(callableExample1);
        FutureTask<String> futureTask2 = new FutureTask<String>(callableExample2);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(futureTask1);
        executor.execute(futureTask2);
        while(true){
            try{
                if(futureTask1.isDone() && futureTask2.isDone()){
                    System.out.println("Done");
                    executor.shutdown();
                    return;
                }
                if (!futureTask1.isDone()){
                    System.out.println("FutureTask1 output="+futureTask1.get());
                }
                System.out.println("Waiting for FutureTask2 to complete ");
                String s = futureTask2.get(200L,TimeUnit.MILLISECONDS);
                if( s != null) {
                    System.out.println("FutureTaks2 output="+s);
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }catch (TimeoutException e){
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }
}
