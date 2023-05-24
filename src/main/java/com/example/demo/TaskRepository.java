package com.example.demo;


import org.springframework.stereotype.Repository;

import java.util.List;


public interface TaskRepository {

    List<Task> findAll();
}
