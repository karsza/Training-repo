package com.controllers;

import com.domain.Status;
import com.domain.Task;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.repositories.TaskRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TaskControllerTest {
    @Autowired
    private MockMvc mockMvc;
//    @MockBean
//    private TaskController taskController;
    @Test
    public void getAllTasksEmptyList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/toDo")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("[]"));
    }
    @Test
    public void addTask() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        Task task = new Task("Test", Status.IN_PROGRESS);
        String jsonString = mapper.writeValueAsString(task);

        mockMvc.perform(MockMvcRequestBuilders
                .post("/toDo/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonString)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isCreated());
    }
    @Test
    public void getAllTasks() throws Exception{
        TaskRepository toDo = TaskRepository.getInstance();
        Task task = new Task("Test",Status.DONE);
        toDo.addTask(task);

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(task);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/toDo")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("[" + jsonString + "]"));
    }
//    @Test
//    public void getAllTasksMock() throws Exception{
//        String expectedResponse = "[{\"subject\":\"Test\",\"status\":\"DONE\"}]";
//
//        List<Task> taskList =  new ArrayList<>();
//        taskList.add(new Task("Test",Status.DONE));
//
//        when(taskController.getAllTasks()).thenReturn(taskList);
//
//        mockMvc.perform(MockMvcRequestBuilders
//                .get("/toDo")
//                .accept(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().string(expectedResponse));
//    }
    @Test
    public void deleteTask() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Task task = new Task("Test1", Status.IN_PROGRESS);
        String jsonString = mapper.writeValueAsString(task);

        mockMvc.perform(MockMvcRequestBuilders
                .delete("/toDo/delete")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonString)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isAccepted());
    }
}