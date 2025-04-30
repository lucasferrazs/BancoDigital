package com.services;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private String nome;
    private Map<Integer, Conta> contas; 

    public Banco(String nome){
        this.nome = nome;
        contas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public ContaCorrente criarContaCorrente(Cliente cliente){
        ContaCorrente cc = new ContaCorrente(this, cliente);
        contas.put(cc.getNumero(), cc);
        return cc;
    }
    
    public ContaPoupanca criarContaPoupanca(Cliente cliente){
        ContaPoupanca cp = new ContaPoupanca(this, cliente);
        contas.put(cp.getNumero(), cp);
        return cp;
    }
    
    public void listarContas() {
        for (Conta conta : contas.values()) {
            conta.imprimirInfoConta();
            System.out.println("---------------");
        }
    }
}
