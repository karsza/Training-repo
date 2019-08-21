package com.com.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "subject")
    private String subject;

    @Column(name = "status")
    private Status status;

}
