package com.controllers;

import com.domain.Task;
import com.repositories.TaskRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class TaskController {
    @RequestMapping (method = RequestMethod.GET,value="/toDo")
    @ResponseBody
    public List<Task> getAllTasks(){
        return TaskRepository.getInstance().getAllTasks();
    }
    @RequestMapping (method = RequestMethod.POST,value = "/toDo/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addTask (@RequestBody Task task){
        TaskRepository.getInstance().addTask(task);
    }
    @RequestMapping (method = RequestMethod.DELETE,value = "/toDo/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String deleteTask (@RequestBody Task task){
        TaskRepository.getInstance().deleteTask(task);
    return task.toString() + "-deleted";
    }
}
