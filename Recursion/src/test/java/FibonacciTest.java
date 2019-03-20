import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci_recursive3(){
        assertEquals(2,Fibonacci.fibonacci(3));
    }
    @Test
    void fibonacci_recursive4(){
        assertEquals(3,Fibonacci.fibonacci(4));
    }
    @Test
    void fibonacci_recursive5(){
        assertEquals(5,Fibonacci.fibonacci(5));
    }
    @Test
    void fibonacci_recursive6(){
        assertEquals(8,Fibonacci.fibonacci(6));
    }
    @Test
    void fibonacci_recursive7(){
        assertEquals(13,Fibonacci.fibonacci(7));
    }
    @Test
    void fibonacci_iter3(){
        assertEquals(2,Fibonacci.fibonacci_iter(3));
    }
    @Test
    void fibonacci_iter4(){
        assertEquals(3,Fibonacci.fibonacci_iter(4));
    }
    @Test
    void fibonacci_iter5(){
        assertEquals(5,Fibonacci.fibonacci_iter(5));
    }
    @Test
    void fibonacci_iter6(){
        assertEquals(8,Fibonacci.fibonacci_iter(6));
    }
    @Test
    void fibonacci_iter7(){
        assertEquals(13,Fibonacci.fibonacci_iter(7));
    }
}