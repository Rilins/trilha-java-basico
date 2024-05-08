import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando o scanner
        Scanner scanner = new Scanner(System.in);
        
        //Pede o nome e armazena
        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.next();

        //Pede a agência e armazena
        System.out.println("Digite o número da Agência:");
        int agencia = scanner.nextInt();

        //pede a conta e armazena
        System.out.println("Digite o número da sua conta:");
        int conta = scanner.nextInt();

        //pede saldo e armazena
        System.out.println("Digite o valor que deseja depositar em sua conta:");
        double saldo = scanner.nextDouble();
        scanner.close();
        
        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
