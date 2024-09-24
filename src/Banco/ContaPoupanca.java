package Banco;

// Classe filha
public class ContaPoupanca extends ContaBancaria {

    // Usando encapsulamento
    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(String titular, double saldo, String numConta, double taxaRendimento) {
        super(titular, saldo, numConta);
        this.taxaRendimento = taxaRendimento;
    }

    // get
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    // set
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    // Aplicando rendimento à conta poupança
    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento / 100;
        setSaldo(getSaldo() + rendimento);
        System.out.println(String.format("Rendimento de %.2f R$ aplicado com sucesso.", rendimento));
    }

    // Usando polimorfismo para rescrever método
    // Exibir saldo da conta poupança
    @Override
    public void exibirSaldo() {
        System.out.println(
                String.format("Saldo atual da conta %s (Conta Poupança): %.2f R$.", getNumConta(), getSaldo()));
    }
}