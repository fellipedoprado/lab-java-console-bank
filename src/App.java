import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao banco!");

        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da sua agencia:");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da sua conta:");
        int conta = scanner.nextInt();

        System.out.print("Digite o valor do seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, agencia, conta, saldo);
        System.out.println("\n\n");
        
        scanner.close();
    }
}
