import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void equals() {
        Task task1 = new Task("Lab test",Status.INPROGRESS);
        Task task2 = new Task ("Test",Status.DONE);

        assertTrue(task1!=task2);
    }
    @Test
    void equals1(){
        Task task1 = new Task("Lab test",Status.INPROGRESS);
        Task task2 = new Task ("Lab test",Status.INPROGRESS);

        assertTrue(task1==task2);
        assertEquals(true, task1.equals(task2));
    }
}