package br.dcx.ufpb.anderson.agenda;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContatoTest {

    public void testaConstrutor(){
        Contato c1 = new Contato("Anderson", 17, 11);
        assertEquals("Anderson", c1.getNome());
        assertEquals(17, c1.getDiaAniversario());
        assertEquals(11, c1.getMesAniversario());
    }
}
