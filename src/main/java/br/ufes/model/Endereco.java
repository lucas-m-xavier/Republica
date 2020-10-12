/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.model;

import br.ufes.enums.EnumUF;

/**
 *
 * @author Lucas
 */
public class Endereco {
    protected String cep;
    protected String bairro;
    protected String referencia;
    protected int numero;
    protected String logradouro;
    protected EnumUF uf;

    public Endereco(String cep, String bairro, String referencia, int numero, String logradouro, EnumUF uf) {
        this.cep = cep;
        this.bairro = bairro;
        this.referencia = referencia;
        this.numero = numero;
        this.logradouro = logradouro;
        this.uf = uf;
    }

    public Endereco(String cep, String bairro, int numero, String logradouro, EnumUF uf) {
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
        this.logradouro = logradouro;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getNumero() {
        return numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public EnumUF getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ", bairro=" + bairro + ", referencia=" + referencia + ", numero=" +
                numero + ", logradouro=" + logradouro + ", uf=" + uf + '}';
    }
}
