package br.ufes.model;

import java.util.ArrayList;

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
    protected ArrayList<HistoricoMorador> historico = new ArrayList<>();

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

    public ArrayList<HistoricoMorador> getHistorico() {
        return historico;
    }

    public void setRepresentante(boolean representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Morador{" + "\nnome=" + nome + "\napelido=" + apelido + "\ntelefone=" + telefone + "\nlinkRedeSocial=" +
                linkRedeSocial + "\ntelefoneResponsavel1=" + telefoneResponsavel1 + "\ntelefoneResponsavel2=" +
                telefoneResponsavel2 + "\nrepresentante=" + representante + "\nhistorico=\n" + historico + '}' + "\n";
    }
}
