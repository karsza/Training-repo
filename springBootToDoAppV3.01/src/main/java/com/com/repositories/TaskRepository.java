package com.com.repositories;

import com.com.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Task findBySubject(String subject);

    Task findByStatus(String status);
}
