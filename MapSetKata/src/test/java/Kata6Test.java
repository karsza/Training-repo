import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class Kata6Test {
    @Test
    public void countArgsTest() {
        assertEquals(3, Kata6.countArgs(1, 2, 3));
        assertEquals(3, Kata6.countArgs(1, 2, "uhsaf uas"));
        assertEquals(1, Kata6.countArgs(1));
        assertEquals(4, Kata6.countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
        assertEquals(0, Kata6.countArgs());
    }
    @Test
    public void doubleArrayTest(){
        int[] array1 = new int[]{1,2,3};
        int[] arrayExpected = new int[]{2,4,6};
        assertArrayEquals(arrayExpected,Kata6.doubleArray(array1));
    }
    @Test
    public void fitTest(){
        assertEquals(0, Kata6.enough(10, 5, 5));
        assertEquals(10, Kata6.enough(100, 60, 50));
    }

}