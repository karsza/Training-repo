package com.domain;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table (name = "tasks_table")
public class Task {
    @Id
    @Column(name="id", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column (name="subject")
    private String subject;

    @Column(name="status")
    @Enumerated (EnumType.STRING)
    private Status status;

//    public Task(String subject, Status status) {
//        this.status=status;
//        this.subject=subject;
//    }
}

