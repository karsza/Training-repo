import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {

    @org.junit.jupiter.api.Test
    void addTask1() {
        ToDo toDo1 = new ToDo();
        Task task1 = new Task("Buy pencils",Status.INPROGRESS);
        Task task2 = new Task("Change tires",Status.INPROGRESS);

        toDo1.addTask(task1);
        toDo1.addTask(task2);

        ToDo todo = new ToDo();
        todo.addTask(new Task ("Fix breaks",Status.DONE));

        assertTrue(todo != toDo1);
    }
    @org.junit.jupiter.api.Test
    void addSameTask(){
        ToDo toDo1 = new ToDo();
        Task task1 = new Task ("Buy lamp",Status.INPROGRESS);
        Task task2 = new Task ("Buy lamp",Status.INPROGRESS);

        ToDo toDo2 = new ToDo();
        Task task3 = new Task ("Buy lamp",Status.INPROGRESS);
        toDo2.addTask(task3);
        toDo1.addTask(task1);
        toDo1.addTask(task2);

        assertEquals(toDo1,toDo2);
    }
    @org.junit.jupiter.api.Test
    void removeTask(){
        ToDo toDo1 = new ToDo();
        Task task1 = new Task ("Write tests",Status.INPROGRESS);
        Task task2 = new Task ("Clean up code",Status.INPROGRESS);
        toDo1.addTask(task1);
        toDo1.addTask(task2);

        ToDo toDo2 = new ToDo();
        Task task3 = new Task ("Write tests",Status.INPROGRESS);
        toDo2.addTask(task3);

        toDo1.removeTask(task2);

        assertEquals(toDo2,toDo1);
    }
    @org.junit.jupiter.api.Test
    void findTask(){
        ToDo toDo1 = new ToDo();
        Task task1 = new Task ("Take out trash",Status.DONE);
        Task task2 = new Task ("Clean up",Status.DONE);
        toDo1.addTask(task1);
        toDo1.addTask(task2);

        Task task3 = new Task ("Clean up",Status.DONE);

        toDo1.findTask(task3);

        assertEquals(task3,toDo1.findTask(task2));

    }

}