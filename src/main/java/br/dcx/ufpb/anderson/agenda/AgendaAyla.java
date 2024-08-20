package br.dcx.ufpb.anderson.agenda;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.List;

public class AgendaAyla {
    private Map<String, Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaAyla(){
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    };

    public void salvarDados(){

    }

    public boolean cadastraContato(String nome, int dia, int mes){
        Contato c = new Contato(nome, dia, mes);
        for ()
    }

}
