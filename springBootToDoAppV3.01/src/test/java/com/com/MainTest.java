package com.com;

import com.com.domain.Task;
import com.com.repositories.TaskRepository;
import com.com.services.TaskService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest {
    Logger log = Logger.getLogger(this.getClass().getName());
    @Autowired
    private TaskRepository taskRepository;

    @Test
    @Transactional
    public void testBySubject() {
        log.info("test by subject");

        Task t = taskRepository.findBySubject("test");
        Assert.assertEquals(new Long(1), t.getId());
    }

    @Autowired
    private TaskService taskService;

    @Test
    public void whenAppStartsHibernateCreatesInitialRecords() {
        List<Task> tasks = taskService.list();
        Assert.assertEquals(tasks.size(), 2);
    }

}