package com.services;

import com.domain.Task;

import java.util.List;

public interface TaskService {
    Task findTask (Task task);
    List<Task> findAllTasks();

}
