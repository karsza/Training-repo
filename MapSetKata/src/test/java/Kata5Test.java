import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata5Test {
    @Test
    public void thirdAngle(){
        assertEquals(123, Kata5.otherAngle(45,12));
        assertEquals(70, Kata5.otherAngle(50,60));

    }

}