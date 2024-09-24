package Banco;

public class ContaBancaria {

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

    // Métodos get
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    // Métodos set
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    // Método depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println(String.format("Depósito de %.2f R$ realizado com sucesso.", valor)); // Corrigido
        } else {
            System.out.println("Valor depositado inválido.");
        }
    }

    // Método sacar
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println(String.format("Saque de %.2f R$ realizado com sucesso.", valor)); // Corrigido
        } else {
            System.out.println("Saque inválido ou insuficiente.");
        }
    }

    // Método para exibir saldo
    public void exibirSaldo() {
        System.out.println(String.format("Saldo atual da conta %s: %.2f R$.", numConta, saldo)); // Corrigido
    }
}