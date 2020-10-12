package br.ufes.model;

/**
 *
 * @author Lucas
 */
public class Morador {
    protected String nome;
    protected String apelido;
    protected String telefone;
    protected String linkRedeSocial;
    protected String telefoneResponsavel1;
    protected String telefoneResponsavel2;
    protected boolean representante;

    public Morador(String nome, String apelido, String telefone, String linkRedeSocial, String telefoneResponsavel1, String telefoneResponsavel2) {
        this.nome = nome;
        this.apelido = apelido;
        this.telefone = telefone;
        this.linkRedeSocial = linkRedeSocial;
        this.telefoneResponsavel1 = telefoneResponsavel1;
        this.telefoneResponsavel2 = telefoneResponsavel2;
        this.representante = false;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getLinkRedeSocial() {
        return linkRedeSocial;
    }

    public String getTelefoneResponsavel1() {
        return telefoneResponsavel1;
    }

    public String getTelefoneResponsavel2() {
        return telefoneResponsavel2;
    }

    public boolean isRepresentante() {
        return representante;
    }

    public void setRepresentante(boolean representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Morador{" + "nome=" + nome + ", apelido=" + apelido + ", telefone=" + telefone + ", linkRedeSocial=" + linkRedeSocial + ", telefoneResponsavel1=" + telefoneResponsavel1 + ", telefoneResponsavel2=" + telefoneResponsavel2 + ", representante=" + representante + '}';
    }
}
