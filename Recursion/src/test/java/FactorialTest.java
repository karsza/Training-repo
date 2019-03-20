
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial_recursive1(){
        assertEquals(1,Factorial.factorial(1));
    }
    @Test
    void factorial_recursive2(){
        assertEquals(2,Factorial.factorial(2));
    }
    @Test
    void factorial_recursive3(){
        assertEquals(6,Factorial.factorial(3));
    }
    @Test
    void factorial_recursive4(){
        assertEquals(24,Factorial.factorial(4));
    }
    @Test
    void factorial_iter1(){
        assertEquals(1,Factorial.factorial_iter(1));
    }
    @Test
    void factorial_iter2(){
        assertEquals(2,Factorial.factorial_iter(2));
    }
    @Test
    void factorial_iter3(){
        assertEquals(6,Factorial.factorial_iter(3));
    }
    @Test
    void factorial_iter4(){
        assertEquals(24,Factorial.factorial_iter(4));
    }
}