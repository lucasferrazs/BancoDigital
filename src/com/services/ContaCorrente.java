package com.services;

public class ContaCorrente extends Conta{

    public ContaCorrente(Banco banco,Cliente cliente) {
        super(cliente, banco);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Corrente");
        super.imprimirInfoConta();
    }

  
}
