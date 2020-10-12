package model;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class Republica {
    protected String nome;
    protected LocalDate fundacao;
    protected LocalDate extincao;
    protected Endereco endereco;
    protected String vantagens;
    protected double despesaPorMorador;
    protected int vagas;
    protected int vagasOcupadas;
    protected int vagasDisponiveis;

    public Republica(String nome, Endereco endereco, String vantagens, double despesaPorMorador, int vagas, int vagasOcupadas) {
        this.nome = nome;
        this.endereco = endereco;
        this.vantagens = vantagens;
        this.despesaPorMorador = despesaPorMorador;
        this.vagas = vagas;
        this.vagasOcupadas = vagasOcupadas;
        this.vagasDisponiveis = this.vagas - this.vagasOcupadas;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public LocalDate getExtincao() {
        return extincao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getVantagens() {
        return vantagens;
    }

    public double getDespesaPorMorador() {
        return despesaPorMorador;
    }

    public int getVagas() {
        return vagas;
    }

    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }
}
