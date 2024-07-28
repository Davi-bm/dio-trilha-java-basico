import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da conta: ");
            int numeroConta = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = sc.nextLine();
            
            System.out.println("Por favor, digite o Nome do Cliente: ");
            String nomeCliente = sc.nextLine();
            
            System.out.println("Por favor, digite o saldo da conta: ");
            double saldo = sc.nextDouble();
            
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                    + "sua agência é " + agencia + ", o número da conta é " + numeroConta
                    + " e seu saldo de " + saldo + " já está disponível para saque.";
            
            System.out.println(mensagem);

            sc.close();
        }


    }
}
