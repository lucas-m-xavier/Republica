package br.ufes.model;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class ReclamacaoSugestao {
    protected LocalDate dataCriacao;
    protected Morador autor;
    protected String descricao;
    protected LocalDate dataSolucao;
    protected int idade;
    protected boolean excluida;

    public ReclamacaoSugestao(String descricao) {
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.excluida = false;
    }

    public ReclamacaoSugestao(Morador autor, String descricao) {
        this.autor = autor;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.excluida = false;
    }
    
    public void solucionar() {
        this.dataSolucao = LocalDate.now();
        this.idade = (this.dataSolucao.getDayOfYear() - this.dataCriacao.getDayOfYear());
    }
    
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public Morador getAutor() {
        return autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataSolucao() {
        return dataSolucao;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isExcluida() {
        return excluida;
    }
}
