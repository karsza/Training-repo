package com.repositories;

import com.domain.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TaskRepository {
    private List<Task> toDo;
    private static TaskRepository taskList = null;

    private TaskRepository () {
        toDo = new ArrayList<Task>();
    }
    public static TaskRepository getInstance(){
        if (taskList == null){
            taskList = new TaskRepository();
            return taskList;
        }
        else {
            return taskList;
        }
    }
    public void addTask (Task task){
        toDo.add(task);
    }
    //by status
    public String updateTask (Task task){
        for (int i=0;i<toDo.size();i++){
            Task task1 = toDo.get(i);
            if (task1.getSubject().equalsIgnoreCase(task.getSubject())){
                toDo.set(i,task);//updating task
                return "Task " + task + " updated";
            }
        }
        return "Update of " + task + " not successful";
    }
    public List<Task> getAllTasks(){
        return toDo;
    }
    public Task getTask(Task task){
        if (toDo.contains(task)){
            return task;
        }
        else return null;
    }
}
