import java.util.Scanner; // Todo: conhecer e importar a classe Scanner

public class BancoSimples {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Ferramenta pra pegar as informações do usuário

        System.out.println("Bem-vindo ao Banco Simples!");

        // Pedindo os dados pro usuário
        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o nome da agência: ");
        String nomeAgencia = scanner.nextLine();

        // Criando a conta
        Conta novaConta = new Conta(nomeTitular, nomeAgencia);

        // Exibindo a mensagem de sucesso
        System.out.println("Conta criada com sucesso!");
        System.out.println("Titular: " + novaConta.getTitular());
        System.out.println("Agência: " + novaConta.getAgencia());
        System.out.println("Código de acesso: " + novaConta.getCodigoAcesso());

        // Oferecendo opções de operação
        boolean sair = false;
        while (!sair) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    novaConta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    novaConta.sacar(valorSaque);
                    break;
                case 3:
                    novaConta.mostrarSaldo();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Obrigado por usar o Banco Simples. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close(); // Fechando o scanner pra evitar vazamento de recursos   
    }
}
