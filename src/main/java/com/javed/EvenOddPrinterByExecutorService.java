package com.javed;

import java.util.Enumeration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class EvenOddPrinterByExecutorService {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newFixedThreadPool(2)) {

            IntStream.rangeClosed(1, 10)
                    .forEach(num -> {

                        CompletableFuture<Integer> oddCompletableFuture = CompletableFuture.completedFuture(num)
                                .thenApplyAsync(x -> {
                                    if (x % 2 != 0) {
                                        System.out.println("Thread name " + Thread.currentThread().getName() + " : " + x);
                                    }
                                    return num;
                                }, service);
                        oddCompletableFuture.join();

                        CompletableFuture<Integer> evenCompletableFuture = CompletableFuture.completedFuture(num)
                                .thenApplyAsync(x -> {
                                    if (x % 2 == 0) {
                                        System.out.println("Thread name " + Thread.currentThread().getName() + " : " + x);
                                    }
                                    return num;
                                }, service);

                        evenCompletableFuture.join();
                    });
        }
    }
}
