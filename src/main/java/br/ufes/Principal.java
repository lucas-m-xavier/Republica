/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes;

import br.ufes.enums.EnumUF;
import br.ufes.model.Endereco;
import br.ufes.model.Morador;
import br.ufes.model.Republica;

/**
 *
 * @author Lucas
 */
public class Principal {
    public static void main(String[] args) {
        try {
            //cadastrando endereços
            Endereco e1 = new Endereco("36970-000", "Centro", "Perto da praça", 23, "Rua José", EnumUF.CE);
            Endereco e2 = new Endereco("36970-000", "Centro", "Encima da vidraçaria", 37, "Rua José", EnumUF.CE);
            Endereco e3 = new Endereco("36970-000", "Centro", "Ao lado da barbearia", 259, "Rua José", EnumUF.CE);
            //cadastrando sem tetos
            Morador m1 = new Morador("Jose Algusto Serra", "tico-tico", "(55)5555-5555", "facebook.com/ze", "(55)5555-5555", "(55)5555-5555");
            Morador m2 = new Morador("Antonio Pimentel", "denis", "(44)4444-4444", "facebook.com/ap", "(55)5555-5555", "(55)5555-5555");
            Morador m3 = new Morador("Clodoaldo Ramires", "aldo", "(33)3333-3333", "facebook.com/cr", "(55)5555-5555", "(55)5555-5555");
            Morador m4 = new Morador("Astolfo Rodrigo", "ar", "(11)1111-2222", "facebook.com/ar", "(55)5555-5555", "(55)5555-5555");
            Morador m5 = new Morador("Fernando Claudio", "fefe", "(00)0000-0000", "facebook.com/fc", "(55)5555-5555", "(55)5555-5555");
            //criando uma república com o m1 como representante e adicionando m5 a mesma
            Republica r1 = new Republica("Cachorrão", e1, "play5 e pebolin", 450.79, 6, m1);
            r1.addMorador(m5);
            System.out.println(r1.toString());
            
        }   catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());
        }
    }
}
