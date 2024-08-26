package br.dcx.ufpb.anderson.agenda;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;

public class AgendaAylaTest {
    @Test
    public void testaCadastroPesquisaRemocao(){
        AgendaAyla agenda = new AgendaAyla();
        Collection<Contato> contatosAchados = agenda.pesquisaAniversariantes(17,11);
        assertTrue(contatosAchados.size()==0);
        agenda.cadastraContato("Ana", 11,3);
        agenda.cadastraContato("Eunice", 14,7);
        contatosAchados = agenda.pesquisaAniversariantes(20,8);
        assertEquals(3, contatosAchados.size());
        Contato ana = new Contato("Ana", 11,3);
        assertTrue(contatosAchados.contains(ana));
        Contato eunice = new Contato("Eunice", 14, 7);
        try {
            boolean removeu = agenda.removeContato("Eunice");
            assertTrue(removeu);
        } catch (ContatoInexistenteException e){
            fail("Lançou exceção quando não deveria");
        }
    }

}
