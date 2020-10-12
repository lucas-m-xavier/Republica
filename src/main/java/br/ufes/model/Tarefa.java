package br.ufes.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Tarefa {
    protected LocalDate dataAgendamento;
    protected ArrayList<Morador> moradores;
    protected String descricao;
    protected LocalDate dataTermino;
    protected boolean finalizada;

    public Tarefa(ArrayList<Morador> moradores, String descricao, LocalDate dataTermino, boolean finalizada) {
        this.dataAgendamento = LocalDate.now();
        this.moradores = moradores;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.finalizada = finalizada;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public ArrayList<Morador> getMoradores() {
        return moradores;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public boolean isFinalizada() {
        return finalizada;
    }
}
