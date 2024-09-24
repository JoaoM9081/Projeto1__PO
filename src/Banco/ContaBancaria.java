package Banco;

// Classe Pai
public class ContaBancaria {

    // Usando encapsulamento
    private String titular; 
    private double saldo; 
    private String numConta; 

    // Construtor 
    public ContaBancaria(String titular, double saldo, String numConta) {
        super();
        this.titular = titular; 
        this.saldo = saldo; 
        this.numConta = numConta; 
    }

    // gets
    public String getTitular() {
        return titular; 
    }
    public double getSaldo() {
        return saldo; 
    }
    public String getNumConta() {
        return numConta; 
    }

    // sets
    public void setTitular(String titular) {
        this.titular = titular; 
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo; 
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta; 
    }

    // Depositando um valor na conta
    public void depositar(double valor) {
        if (valor > 0) { 
            saldo += valor; // Adiciona o valor ao saldo da conta
            System.out.println(String.format("Depósito de %.2f R$ realizado com sucesso.", valor)); 
        } else {
            System.out.println("Valor depositado inválido."); 
        }
    }

    // Sacando um valor da conta
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor; // Deduz o valor do saldo da conta
            System.out.println(String.format("Saque de %.2f R$ realizado com sucesso.", valor)); 
        } else {
            System.out.println("Saque inválido ou insuficiente."); 
        }
    }

    // Exibindo o saldo atual da conta
    public void exibirSaldo() {
        System.out.println(String.format("Saldo atual da conta %s: %.2f R$.", numConta, saldo)); 
    }
}