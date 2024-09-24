package Banco;

import java.util.Scanner;

// Classe filha
public class ContaCorrente extends ContaBancaria {

    // Usando encapsulamento
    private double limiteCredito; // Limite de crédito disponível

    // Construtor
    public ContaCorrente(String titular, double saldo, String numConta, double limiteCredito) {
        super(titular, saldo, numConta);
        this.limiteCredito = limiteCredito;
    }

    // get
    public double getLimiteCredito() {
        return limiteCredito;
    }

    // set
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    // Usando polimorfismo para rescrever método
    // Sacando com escolha de crédito ou débito
    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Você quer usar [1] Débito ou [2] Crédito? ");
            int opcao = scanner.nextInt(); // Lê a opção do usuário

            if (opcao == 1) { // Saque pelo débito
                if (getSaldo() >= valor) { // Verifica saldo
                    setSaldo(getSaldo() - valor); // Deduz o valor do saldo
                    System.out.println(String.format(
                            "Saque de %.2f R$ realizado com sucesso pelo débito. Saldo restante: %.2f R$.", valor,
                            getSaldo()));
                } else {
                    System.out.println("Saldo insuficiente no débito.");
                }
            } else if (opcao == 2) { // Saque pelo crédito
                if (limiteCredito >= valor) { // Verifica limite de crédito
                    limiteCredito -= valor; // Deduz do limite de crédito
                    System.out.println(String.format(
                            "Saque de %.2f R$ realizado com sucesso pelo crédito. Limite de crédito restante: %.2f R$.",
                            valor, limiteCredito));
                } else {
                    System.out.println("Limite de crédito insuficiente.");
                }
            } else {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    // Usando polimorfismo para rescrever método
    // Exibir saldo com distinção entre débito e crédito
    @Override
    public void exibirSaldo() {
        System.out.println(String.format(
                "Saldo atual da conta %s (Conta Corrente): %.2f R$ em débito. Limite de crédito disponível: %.2f R$.",
                getNumConta(), getSaldo(), limiteCredito));
    }
}