package com.domain;

import lombok.Data;

//import org.springframework.boot.autoconfigure.domain.EntityScan;
@Data
//@EntityScan

public class Task {
    private String subject;
    private Status status;

    public Task(String subject, Status status) {
        this.subject = subject;
        this.status = status;
    }
}

