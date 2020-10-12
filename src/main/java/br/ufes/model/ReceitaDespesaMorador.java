package br.ufes.model;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class ReceitaDespesaMorador {
    protected double valor;
    protected LocalDate dataPagamento;
    protected boolean pago;
    protected Morador morador;

    public ReceitaDespesaMorador(double valor, Morador morador) {
        this.valor = valor;
        this.pago = false;
        this.morador = morador;
    }

    public ReceitaDespesaMorador(double valor, LocalDate dataPagamento, Morador morador) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.pago = true;
        this.morador = morador;
    }
    
    public double getValor() {
        return valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public boolean isPago() {
        return pago;
    }

    public Morador getMorador() {
        return morador;
    }
}
