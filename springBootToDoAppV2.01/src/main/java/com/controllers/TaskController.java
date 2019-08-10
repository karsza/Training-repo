package com.controllers;

import com.domain.Task;
import com.repositories.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class TaskController {
    @RequestMapping (method = RequestMethod.GET,value="/toDo")
    @ResponseBody
    public List<Task> getAllTasks(){
        return TaskRepository.getInstance().getAllTasks();
    }
    @ResponseStatus (value= HttpStatus.CREATED,reason = "Task added")
    @RequestMapping (method = RequestMethod.POST,value = "/toDo/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addTask (@RequestBody Task task){
        TaskRepository.getInstance().addTask(task);
    }
    @RequestMapping (method = RequestMethod.DELETE,value = "/toDo/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus (value= HttpStatus.ACCEPTED ,reason = "Task deleted")
    @ResponseBody
    public void deleteTask (@RequestBody Task task){
        TaskRepository.getInstance().deleteTask(task);
    }
}
