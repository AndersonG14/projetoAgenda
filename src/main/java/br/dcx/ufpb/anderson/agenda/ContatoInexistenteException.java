package br.dcx.ufpb.anderson.agenda;

public class ContatoInexistenteException extends Exception {
    public ContatoInexistenteException(String mensagem){
        super(mensagem);
    }

    public ContatoInexistenteException(){
        super("Contato inexistente");
    }
}
