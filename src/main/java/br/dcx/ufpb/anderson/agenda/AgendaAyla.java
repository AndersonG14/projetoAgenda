package br.dcx.ufpb.anderson.agenda;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.List;

public class AgendaAyla implements Agenda{
    private Map<String, Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaAyla(){
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    };


    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {
        if (contatos.containsKey(nome)) {
            return false; // Contato já existente
        }
        contatos.put(nome, new Contato(nome, dia, mes));
        return true;
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        return contatos.values().stream()
                .filter(c -> c.getDiaAniversario() == dia && c.getMesAniversario() == mes)
                .toList();
    }

    @Override
    public boolean removeContato(String nome) throws ContatoInexistenteException {
        if (!contatos.containsKey(nome)) {
            throw new ContatoInexistenteException("Contato não existe: " + nome);
        }
        contatos.remove(nome);
        return true;
    }

    @Override
    public void salvarDados() throws IOException {
        gravador.salvarContatos(contatos);
    }

    @Override
    public void recuperarDados() throws IOException {
        contatos = gravador.recuperarContatos();
    }

}
