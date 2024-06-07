import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                Escolha uma opção:
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.print(menu);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Saldo atual: " + saldo);
                case 2 -> {
                    System.out.print("Digite o valor a ser transferido: ");
                    double valorTransferencia = sc.nextDouble();
                    if (valorTransferencia <= saldo) {
                        saldo -= valorTransferencia;
                        System.out.println("Transferência realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                }
                case 3 -> {
                    System.out.print("Digite o valor a ser recebido: ");
                    double valorRecebido = sc.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Valor recebido com sucesso!");
                }
                case 4 -> System.out.println("Saindo.");
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}