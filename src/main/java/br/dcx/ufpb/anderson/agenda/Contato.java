package br.dcx.ufpb.anderson.agenda;

import java.util.Objects;

public class Contato {
    private String nome;
    private int diaAniversario;
    private int mesAnivesario;

    public Contato(String nome, int diaAniversario, int mesAnivesario){
        this.nome = nome;
        this.diaAniversario = diaAniversario;
        this.mesAnivesario = mesAnivesario;
    }

    @Override
    public String toString() {
        return "Contato de nome " +
                ", que aniversaria em " + diaAniversario +
                "/" + mesAnivesario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return diaAniversario == contato.diaAniversario && mesAnivesario == contato.mesAnivesario && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, diaAniversario, mesAnivesario);
    }
}
