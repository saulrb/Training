package com.java8.features;

import java.util.concurrent.*;

public class CompletableFutureExample {

    public Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<String>();

        Executors.newCachedThreadPool().submit( () -> {
           Thread.sleep(10);
           completableFuture.complete("Hello");
           return null;
        });
        return completableFuture;
    }

    public static void main(String[] args) throws Exception{
        //CompletableFutureExample completableFutureExample = new CompletableFutureExample();
        //Future<String> future = completableFutureExample.calculateAsync();
        //System.out.println(future.get());

        CompletableFuture<Void> future = CompletableFuture.runAsync(() ->  {
                try {
                    TimeUnit.SECONDS.sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("I'll run in a separate thread the main thread.");
            });

        future.get();

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            return "Result of the asynchronous computation 1";
        });

        System.out.println(future1.get());

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(2);
            }catch(InterruptedException e){
                throw new IllegalStateException(e);
            }
            return "Result of the asynchronous computation 2";
        }, executorService);
        executorService.shutdown();
        System.out.println(future2.get());

    }

}
