import java.util.UUID; // Pra gerar o código de acesso único


public class Conta {
    private String titular;
    private String agencia;
    private double saldo;
    private String codigoAcesso;

    // Construtor
    public Conta(String titular, String agencia) {
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = 0.0;
        this.codigoAcesso = UUID.randomUUID().toString(); // Gerando um código único

        // Exibindo mensagem de sucesso ao criar a conta
                System.out.println("\nConta criada com sucesso!");
        System.out.println("Titular: " + this.titular);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Código de acesso: " + this.codigoAcesso);

    }

    // Métodos de acesso (getters)
    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    // Métodos de operação
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("O saldo atual da conta é: R$" + saldo);
    }
}