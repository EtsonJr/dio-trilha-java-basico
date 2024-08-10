import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.println("Digite o Usuário:");
            int usuario = Scanner.nextInt(); //Para numeros deve se usar 'int' e a variavel seguida de scanner.nextInt

            System.out.println("Agência:");// Agencia está pulando, não recebe entrada do usuário.
            String agencia = Scanner.nextLine();

            System.out.println("Digite Seu Nome:");// Funciona!
            String nomeCliente = Scanner.nextLine();

            System.out.println("Digite seu saldo:");//Funciona!
            double saldo = Scanner.nextDouble();

            System.out.println("Usuário:" + usuario);

            System.out.println("Agência:" + agencia);

            System.out.println("Nome:" + nomeCliente);

            System.out.println("Saldo:" + saldo);
            
        }
        }
        }