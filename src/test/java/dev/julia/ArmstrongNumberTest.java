
package dev.julia;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArmstrongNumberTest {

    @Test
    public void testIsArmstrong() {
        assertEquals(true, ArmstrongNumber.isArmstrong(153));
        assertEquals(true, ArmstrongNumber.isArmstrong(370));
        assertEquals(true, ArmstrongNumber.isArmstrong(371));
        assertEquals(true, ArmstrongNumber.isArmstrong(407));
        assertEquals(true, ArmstrongNumber.isArmstrong(9474));
        assertEquals(false, ArmstrongNumber.isArmstrong(123));
        assertEquals(true, ArmstrongNumber.isArmstrong(0));
        assertEquals(true, ArmstrongNumber.isArmstrong(1));
        assertEquals(false, ArmstrongNumber.isArmstrong(10));
    }
}