import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {

    @org.junit.jupiter.api.Test
    void addTask() {
        ArrayList<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task("Interview","To be held"));


    }
}