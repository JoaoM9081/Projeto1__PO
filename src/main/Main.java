package main;

import Banco.ContaCorrente;
import Banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        // Criando uma Conta Corrente com saldo inicial de 1000 R$ e limite de crédito de 2000 R$
        ContaCorrente cc = new ContaCorrente("João", 1000.00, "12345-5", 2000.00);
        
        // Criando uma Conta Poupança com saldo inicial de 2000 R$ e taxa de rendimento de 0.5%
        ContaPoupanca cp = new ContaPoupanca("Maria", 2000.00, "67890-7", 0.5);

        // Operações com a Conta Corrente
        System.out.println("Operações com Conta Corrente:");
        cc.exibirSaldo();
        cc.sacar(800.00);  // Primeiro saque usando o saldo (débito)
        cc.exibirSaldo();
        cc.sacar(800.00);  // Segundo saque usará o crédito
        cc.exibirSaldo();
        cc.depositar(300.00);  // Depósito para repor saldo
        cc.exibirSaldo();
        cc.sacar(1500.00);  // Tentativa de saque excedendo saldo e crédito
        cc.exibirSaldo();
        
        System.out.println("==============================");

        // Operações com a Conta Poupança
        System.out.println("Operações com Conta Poupança:");
        cp.exibirSaldo();
        cp.aplicarRendimento();  // Aplicando rendimento mensal
        cp.exibirSaldo();
        cp.sacar(500.00);  // Saque de 500 R$
        cp.exibirSaldo();
        cp.depositar(1000.00);  // Depósito de 1000 R$
        cp.exibirSaldo();
    }
}