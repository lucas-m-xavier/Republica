package br.ufes.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class ReceitaDespesa {
    protected String tipo;
    protected String descricao;
    protected LocalDate dataVencimento;
    protected double valor;
    protected boolean pago;
    protected ArrayList<ReceitaDespesaMorador> receitasDespesasTotais = new ArrayList<>();
    protected Republica republica;

    public ReceitaDespesa(String tipo, String descricao, LocalDate dataVencimento, double valor, Republica republica) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.pago = false;
        this.republica = republica;
    }

    public ReceitaDespesa(String tipo, String descricao, LocalDate dataVencimento, double valor, boolean pago, Republica republica) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.pago = pago;
        this.republica = republica;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    public ArrayList<ReceitaDespesaMorador> getReceitasDespesasTotais() {
        return receitasDespesasTotais;
    }

    public Republica getRepublica() {
        return republica;
    }
}
