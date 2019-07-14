package com.todo.Service;

import com.todo.Dao.TaskDao;
import com.todo.EntityOrDomain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TaskService {

    @Autowired
    private TaskDao taskDao;
    public Collection<Task> getAllTasks(){
        return this.taskDao.getAllTasks();
    }
    public Task getTaskByStatus (int status){
        return this.taskDao.getTaskByStatus(status);
    }

    public void removeTaskById(int id) {
        this.taskDao.removeTaskById(id);
    }
    public void updateTask (Task task){
        this.taskDao.updateTask(task);
    }

    public Task getTaskByID(int id) {
        return  this.taskDao.getTaskById(id);
    }
}
