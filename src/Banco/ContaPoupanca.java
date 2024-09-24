package Banco;

public class ContaPoupanca extends ContaBancaria {
    
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, String numConta, double taxaRendimento) {
        super(titular, saldo, numConta);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento / 100;
        setSaldo(getSaldo() + rendimento);
        System.out.println(String.format("Rendimento de %.2f R$ aplicado com sucesso.", rendimento));
    }

    @Override
    public void exibirSaldo() {
        System.out.println(String.format("Saldo atual da conta %s (Conta Poupança): %.2f R$.", getNumConta(), getSaldo()));
    }
}