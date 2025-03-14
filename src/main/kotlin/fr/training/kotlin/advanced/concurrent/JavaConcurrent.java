package fr.training.kotlin.advanced.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class JavaConcurrent {

    private final Apis apis;

    public JavaConcurrent() {
        this.apis = new Apis();
    }

    public Dilly command() {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            return CompletableFuture.supplyAsync(apis::fetchPreferences, executor)
                    .thenApply(apis::fetchBeer)
                    .thenCombine(CompletableFuture.supplyAsync(apis::fetchVodka, executor), Dilly::new)
                    .join();
        }
    }
}
