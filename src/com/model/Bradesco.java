package com.model;

import com.services.*;

public class Bradesco {
    public static void main(String[] args){
        Banco banco = new Banco("Bradesco");
        Cliente cliente = new Cliente("Lucas");

        Conta cc = new ContaCorrente(banco,cliente);
        Conta poupanca = new ContaPoupanca(banco,cliente);

       
        cc.depositar(5000);
        cc.imprimirExtrato();
        cc.transferir(2500, poupanca);
        cc.imprimirExtrato();
        cc.sacar(6000);
        poupanca.imprimirExtrato();
    }
}
