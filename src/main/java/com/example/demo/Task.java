package com.example.demo;

import java.util.UUID;

public record Task(UUID id, String title, boolean completed) {


    public Task(String details){
        this(UUID.randomUUID(), details, false);
    }
}
