package Engtelecom.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VirtualMachineTest {

    @Test
    void genericTest() {
        VirtualMachine v = new VirtualMachine("Test", 2, 20);

        assertTrue(v.TurnOn());
        assertFalse(v.TurnOff());

    }

}
