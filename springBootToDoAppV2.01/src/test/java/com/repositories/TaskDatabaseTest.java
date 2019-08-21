//package com.repositories;
//import com.domain.Status;
//import com.domain.Task;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class TaskDatabaseTest {
//
//    @Test
//    public void readAllFromDb() {
//        Task task1 = new Task("Test1",Status.IN_PROGRESS);
//        TaskDatabase taskDatabase = new TaskDatabase();
//
//        taskDatabase.createNewTableIfNoExists();
//        taskDatabase.insertTask(task1);
//
//        List<Task> expectedResult= new ArrayList<>();
//        expectedResult.add(task1);
//
//        ArrayList<Task> resultFromDB = taskDatabase.readAllFromDb();
//        System.out.println(resultFromDB.toString());
//
//        assertArrayEquals(expectedResult.toArray(),resultFromDB.toArray());
//    }
//}