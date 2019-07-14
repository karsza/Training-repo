package com.todo.Dao;

import com.todo.EntityOrDomain.Task;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TaskDao {
    private static Map<Integer,Task> toDo;

    static{
        toDo = new HashMap<Integer, Task>(){
            {
                put(1, (new Task(1,"Clean","inprogress")));
                put(2, (new Task(2,"Write","inprogress")));
                put(3, (new Task(3,"Take away","inprogress")));
                put(4, (new Task(4,"Sign in","completed")));
            }
        };
    }
    public Collection<Task> getAllTasks(){
        return this.toDo.values();
    }
    public void removeTaskById(int id) {
        this.toDo.remove(id);
    }
    public void updateTask (Task task){
        Task t = toDo.get(task.getId());
        t.setSubject(task.getSubject());
        t.setStatus(task.getStatus());
        toDo.put(task.getId(),task);
    }

    public Task getTaskByStatus(int status) {
        return toDo.get(status);
    }

    public Task getTaskById(int id) {
        return this.toDo.get(id);
    }
}
