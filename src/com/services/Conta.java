package com.services;

public abstract class Conta implements IConta {
    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected static Banco banco;

    private static final int AGENCIA_PADRAO = 1;

    
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente,Banco banco){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        Conta.banco = banco;
    }
   

    public int getAgencia() {
        return agencia;
    }
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void imprimirExtrato(){

    }

    public  void imprimirInfoConta(){
        System.out.println(String.format("Titular: %s", this.cliente));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("  ");
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo - valor > 0){
        this.saldo = this.saldo - valor;
    }
    else{
        throw new RuntimeException("Não a saldo o suficiente para realizar o saque ");
    }
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
       if(this.saldo - valor > 0){
        this.sacar(valor);
       contaDestino.depositar(valor);
    }
       else{
        throw new RuntimeException("não a saldo o suficiente para realizar a transferencia");
       }
    }
}
