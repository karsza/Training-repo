import org.junit.jupiter.api.Test;

import javax.accessibility.AccessibleStateSet;

import static org.junit.jupiter.api.Assertions.*;

class Kata9Test {
    @Test
    public void rangeExtractionBasicTests() {
        assertEquals("7-11,14,15,17-20", Kata9.rangeExtraction(new int[]{7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));

        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", Kata9.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));

        assertEquals("-3--1,2,10,15,16,18-20", Kata9.rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
    }

    @Test
    public void rangeExtractionAdditionalTests() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", Kata9.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));

    }

    @Test
    public void monkeyCountTests() {
        assertArrayEquals((new int[]{1, 2, 3}), Kata9.monkeyCount(3));
        assertArrayEquals((new int[]{1}), Kata9.monkeyCount(1));

    }

    @Test
    public void test() {
        assertArrayEquals(new int[]{0}, Kata9.sumParts(new int[]{}));
        assertArrayEquals(new int[]{20, 20, 19, 16, 10, 0}, Kata9.sumParts(new int[]{0, 1, 3, 6, 10}));
        assertArrayEquals(new int[]{21, 20, 18, 15, 11, 6, 0}, Kata9.sumParts(new int[]{1, 2, 3, 4, 5, 6}));
        assertArrayEquals(new int[]{10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0}, Kata9.sumParts(new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358}));
    }
    @Test
    public void sumTest(){
        assertEquals(3, Kata9.sum(new int[]{0,1,2}));
        assertEquals(58, Kata9.sum(new int[]{0,1,2,55}));
        assertEquals(0, Kata9.sum(new int[]{0}));

    }
}