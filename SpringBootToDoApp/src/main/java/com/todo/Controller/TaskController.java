package com.todo.Controller;

import com.todo.EntityOrDomain.Task;
import com.todo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/toDo")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Task> getAllTasks(){
        return taskService.getAllTasks();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Task getTaskById (@PathVariable("id") int id){
        return taskService.getTaskByID(id);
    }
    @RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTaskById (@PathVariable("id") int id){
        taskService.removeTaskById(id);
    }
    @RequestMapping (method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteTaskById (@RequestBody Task task){
        taskService.updateTask(task);
    }

}
