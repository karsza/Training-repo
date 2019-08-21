package com.com.controllers;

import com.com.domain.Task;
import com.com.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping(value = "/toDo")
    @ResponseBody
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @ResponseStatus(value = HttpStatus.CREATED, reason = "Task added")
    @PostMapping(value = "/toDo/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addTask(@RequestBody Task task) {
        taskRepository.save(task);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/toDo/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.ACCEPTED, reason = "Task deleted")
    @ResponseBody
    public void deleteTask(@RequestBody Task task) {
        taskRepository.delete(task);
    }
//    @GetMapping(value = "/toDo/{subject}")
//    public Task getTaskBySubject(@PathVariable("subject") final String subject){
//        if (taskRepository.
//    }

}
