import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata9Test {
    @Test


    public void test_BasicTests() {
        assertEquals("7-11,14,15,17-20", Kata9.rangeExtraction(new int[] {7,8,9,10,11,14,15,17,18,19,20}));

        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", Kata9.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));

        assertEquals("-3--1,2,10,15,16,18-20", Kata9.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
    }

}