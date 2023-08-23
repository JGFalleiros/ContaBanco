import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //  Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        // Exibir as mensagens para o usuario e obter pela classe Scanner os valores digitados no terminal
        System.out.println("Digite o número da conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Digite o número da agencia: ");
        agencia = sc.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Digite o saldo da conta: ");
        saldo = sc.nextDouble();

        // Exibir a mensagem final
        System.out.printf("Olá %s!%n" +
                "Obrigado por criar uma conta em nosso banco.%n" +
                "Sua agência é: %s%n" +
                "Conta número: %d%n" +
                "E o saldo de %.2f já está disponível para saque"
                , nomeCliente, agencia,  numeroConta, saldo);


        sc.close();
    }
}