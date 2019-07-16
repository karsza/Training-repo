package com.domain;

import lombok.Data;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Data
@EntityScan

public class Task {
    private String subject;
    private Status status;

//    public Task(String subject, Status status) {
//        this.subject = subject;
//        this.status = status;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
}
