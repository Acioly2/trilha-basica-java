import java.util.Scanner;
import java.util.Locale;

public class ContaBanco {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
    
        System.out.print("Por Favor informe o número da sua conta: ");
        int numeroConta = scanner.nextInt(); //lê numero da conta

        System.out.print("Por Favor informe a sua agência: ");
        scanner.nextLine();
        String agencia = scanner.nextLine(); //lê a agência

        System.out.print("Por Favor informe seu nome: ");
        String nomeCliente = scanner.nextLine(); //lê nome do cliente 

        System.out.print("Por favor, digite o saldo:");
        double saldoConta = scanner.nextDouble(); //lê saldo

        //output 
        System.out.println("Olá ".concat(nomeCliente) +
        " obrigado por criar uma conta em nosso banco, " + 
        "sua agência é ".concat(agencia) +
        ", conta " + (numeroConta) + " e seu saldo " + (saldoConta) + 
        " já está disponível para saque" );
        
        scanner.close();
    }
   
}
