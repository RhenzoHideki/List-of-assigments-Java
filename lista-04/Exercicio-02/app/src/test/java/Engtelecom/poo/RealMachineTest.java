package Engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RealMachineTest {

    @Test
    void rmTest() {
        RealMachine rm = new RealMachine("TesteRM", 16, 250);

        assertTrue(rm.createVm("Teste1", 4, 120));
        assertTrue(rm.createVm("Teste2", 4, 120));
        assertTrue(rm.createVm("Teste3", 4, 120));

        assertTrue(rm.turnOffVm("Teste1"));
        assertTrue(rm.turnOnVm("Teste1"));

        assertTrue(rm.removeVm("Teste1"));
    }

}
