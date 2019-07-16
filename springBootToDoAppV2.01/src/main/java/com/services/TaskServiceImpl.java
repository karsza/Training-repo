package com.services;

import com.domain.Task;
import com.repositories.TaskRepository;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task findTask(Task task) {
        return taskRepository.getTask(task);
    }
    @Override
    public List<Task> findAllTasks() {
        return taskRepository.getAllTasks();
    }
}
