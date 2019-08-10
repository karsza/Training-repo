package com.domain;

import lombok.Data;
@Data
public class Task {
    private String subject;
    private Status status;

    public Task(String subject, Status status) {
        this.status=status;
        this.subject=subject;
    }
}

