package com.java8.features;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample2 {

    public static void main(String[] args) throws Exception{
        completableFutureOne();
        completableFutureTwo();
    }

    private static void completableFutureTwo() throws Exception {
        CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                throw new IllegalStateException(e);
            }
            return "Saul";
        }).thenApply(name -> {
            return  "Hello " + name;
        }).thenApply(greeting -> {
            return greeting + " Welcome to the Columbis Ohio";
        });
        System.out.println(welcomeText.get());
    }
    private static void completableFutureOne() throws Exception{
        CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> {
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                throw new IllegalStateException(e);
            }
            return "Saul";
        });

        CompletableFuture<String> greetingFuture = whatsYourNameFuture.thenApply( name -> {
            return "Hello " + name;
        });

        System.out.println(greetingFuture.get());
    }

}
