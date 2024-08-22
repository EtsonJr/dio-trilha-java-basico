import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.println("Digite sua conta:");
            int contaNum = Scanner.nextInt();
            System.out.println("Agência:");
            String agencia = Scanner.nextLine();
            agencia = Scanner.nextLine();

            System.out.println("Digite Seu Nome:");
            String nomeCliente = Scanner.nextLine();

            System.out.println("Digite seu saldo:");
            double saldo = Scanner.nextDouble();

            System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta "+ contaNum +" E seu saldo de R$"+ saldo +" Já está disponivel para saque.");

        }
        }
        }