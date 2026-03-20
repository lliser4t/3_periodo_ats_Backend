import java.util.Scanner;

public class CaixaEletrônico {
    private double saldo;

    public CaixaEletrônico() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente!");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== Caixa Eletrônico ====");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depositar: R$");
                    double valorDeposito = scanner.nextDouble();
                    depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: R$");
                    double valorSaque = scanner.nextDouble();
                    sacar(valorSaque);
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println(); // linha em branco para melhor visualização
        } while (opcao != 4);

        scanner.close();
    }
}