package com;

import com.controllers.TaskController;
import com.domain.Status;
import com.domain.Task;
import com.repositories.TaskDatabase;
import com.repositories.TaskRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
        //(scanBasePackages = {"com"})

public class Main {
        public static void main(String[] args) {
            SpringApplication.run(Main.class, args);
        }

}
