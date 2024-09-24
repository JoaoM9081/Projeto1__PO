package Banco;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {

    private double limiteCredito; // Limite de crédito disponível

    public ContaCorrente(String titular, double saldo, String numConta, double limiteCredito) {
        super(titular, saldo, numConta);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    // Método para sacar com escolha de crédito ou débito
    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Você quer usar [1] Débito ou [2] Crédito? ");
            int opcao = scanner.nextInt();

            if (opcao == 1) { // Débito
                if (getSaldo() >= valor) {
                    setSaldo(getSaldo() - valor);
                    System.out.println(String.format("Saque de %.2f R$ realizado com sucesso pelo débito. Saldo restante: %.2f R$.", valor, getSaldo()));
                } else {
                    System.out.println("Saldo insuficiente no débito.");
                }
            } else if (opcao == 2) { // Crédito
                if (limiteCredito >= valor) {
                    limiteCredito -= valor;
                    System.out.println(String.format("Saque de %.2f R$ realizado com sucesso pelo crédito. Limite de crédito restante: %.2f R$.", valor, limiteCredito));
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

    // Exibir saldo com distinção entre débito e crédito
    @Override
    public void exibirSaldo() {
        System.out.println(String.format("Saldo atual da conta %s (Conta Corrente): %.2f R$ em débito. Limite de crédito disponível: %.2f R$.", getNumConta(), getSaldo(), limiteCredito));
    }
}