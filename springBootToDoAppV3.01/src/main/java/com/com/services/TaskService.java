package com.com.services;

import com.com.domain.Status;
import com.com.domain.Task;
import com.com.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public List<Task> list() {
        return taskRepository.findAll();
    }

    @PostConstruct
    public void init() {
        Task task = new Task();
        task.setSubject("test");
        task.setStatus(Status.DONE);

        taskRepository.save(task);

        Task task1 = new Task();
        task.setSubject("test1");
        task.setStatus(Status.DONE);

        taskRepository.save(task1);

    }

}
