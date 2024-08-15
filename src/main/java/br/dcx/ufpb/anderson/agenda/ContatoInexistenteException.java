package br.dcx.ufpb.anderson.agenda;

public class ContatoInexistenteException extends Exception {
    public ContatoInexistenteException(String mensagem){
        super(mensagem);
    }
}
