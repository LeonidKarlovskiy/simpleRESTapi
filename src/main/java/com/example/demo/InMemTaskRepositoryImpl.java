package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Repository
public class InMemTaskRepositoryImpl implements TaskRepository {

    private final List<Task> tasks = new LinkedList<>(){{
        this.add(new Task("first task"));
        this.add(new Task("second task"));
    }};

    @Override
    public List<Task> findAll() {
        return Collections.unmodifiableList(this.tasks);
    }

    @Override
    public void save(Task task) {
        this.tasks.add(task);
    }
}
