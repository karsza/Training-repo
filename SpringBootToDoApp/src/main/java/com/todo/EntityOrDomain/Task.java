package com.todo.EntityOrDomain;

public class Task {
    private int id;
    private String subject;
    private String status;


    public Task(){}

    public Task(int id, String subject, String status) {
        this.subject = subject;
        this.status = status;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId (int id){
        this.id=id;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
