package com.services;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Banco banco,Cliente cliente) {
        super(cliente, banco);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Poupanca");
        super.imprimirInfoConta();
       
    }

 
}
