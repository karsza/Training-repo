import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Kata3Test {


    @Test
    public void squareRoot(){
        assertEquals(9,Kata3.perfect2Root(81));
        assertEquals(0,Kata3.perfect2Root(7));
        assertEquals(2,Kata3.perfect2Root(4));
    }
    @Test
    void sumOfNrsInArrayList(){
        ArrayList<Long> listOfDividors = new ArrayList<Long>();
        listOfDividors.add(Long.valueOf(2));
        listOfDividors.add(Long.valueOf(3));
        listOfDividors.add(Long.valueOf(4));
        listOfDividors.add(Long.valueOf(6));
        listOfDividors.add(Long.valueOf(12));
        assertEquals(27,Kata3.sumOfNrsInArrayList(listOfDividors));
    }
    @Test
    void squareDividorsAndSquarethem(){
        ArrayList<Long> listOfDividors = new ArrayList<Long>();
        listOfDividors.add(Long.valueOf(1));
        listOfDividors.add(Long.valueOf(4));
        listOfDividors.add(Long.valueOf(16));
        listOfDividors.add(Long.valueOf(64));
        assertEquals(listOfDividors,Kata3.squareDividersOafNumberAndSquareThem(8));
    }
    @Test
    public void listSquared1() {
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", Kata3.listSquared(1, 250));
    }
    @Test
    public void listSquared2() {
        assertEquals("[[42, 2500], [246, 84100]]", Kata3.listSquared(42, 250));
    }
    @Test
    public void listSquared3() {
        assertEquals("[[287, 84100]]", Kata3.listSquared(250, 500));
    }
}