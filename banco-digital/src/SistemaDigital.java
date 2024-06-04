import java.util.Scanner;
import banco.*;
import banco.contas.*;

public class SistemaDigital {
    
    static Scanner scanner = new Scanner(System.in);
    static Banco banco = new Banco();

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Informações do Banco");
        System.out.println("2. Adicionar Cliente");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void exibirMenuConta() {
        System.out.println("Menu:");
        System.out.println("1. sacar");
        System.out.println("2. depositar");
        System.out.println("3. transferir");
        System.out.println("4. Extrato");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        
        int opcao;
        do{
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    banco.imprimirInfoBanco();
                    break;

                case 2:
                    adicionarCliente();
                    break;

                case 0:
                    System.out.println("Sair...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
               
        }    while (opcao != 0);
        scanner.close();
    }

    private static void adicionarCliente(){
        System.out.println("Nome do cliente: ");
        String nome = scanner.next();
        System.out.println("Telefone (até 9 números) do cliente: ");
        int telefone = scanner.nextInt();

        Cliente cliente = new Cliente(nome,telefone);
        System.out.println("Cliente adicionado: " + cliente.getNome());
        exibriTipoConta(cliente);                
    }

    public static void exibriTipoConta(Cliente cliente){
        System.out.println("Tipo de conta: (1) Corrente / (2) Poupança / (3) Corrente e Poupança :");
        int tipo = scanner.nextInt();

        if(tipo == 1){
            Conta contaCorrente = new ContaCorrente(cliente);
            banco.adicionarConta(contaCorrente);
            menuConta(contaCorrente);

        }else if(tipo == 2){
            Conta contaPoupanca = new ContaPoupanca(cliente);
            banco.adicionarConta(contaPoupanca);
            menuConta(contaPoupanca);

        }else if(tipo == 3){
            Conta contaCorrente = new ContaCorrente(cliente);
            Conta contaPoupanca = new ContaPoupanca(cliente);
            banco.adicionarConta(contaCorrente);
            banco.adicionarConta(contaPoupanca);
            menuConta(contaCorrente);

        }else{
            System.out.println("Opção inválida");
        }
    }

    public static void transferirParaConta(Conta conta,Conta contaDestino){
        System.out.println("Numero conta destino: " + contaDestino.getNumero());
        System.out.println("Valor a ser transferido: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        if(conta.getSaldo() > valor){
            conta.transferir(valor, contaDestino);
            System.out.println("Transferência de " + valor + " realizada com sucesso para " + contaDestino.getNumero());
        }else{
            System.out.println("Saldo insuficiente na conta: " + conta.getNumero());
        }
    }

    private static void menuConta(Conta conta) {
        int opcao;
        double valor;
        do {
            exibirMenuConta();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Inserir valor: ");
                    valor = scanner.nextDouble();
                    conta.sacar(valor);
                    break;

                case 2:
                    System.out.println("Inserir valor: ");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                    break;

                case 3:
                    System.out.println("Numero conta destino");
                    int numeroConta = scanner.nextInt();
                    Conta contaDestino = banco.procurarConta(numeroConta);
                    if(contaDestino == null){
                        System.out.println("conta destino não encontrada. ");
                        return;
                    }
                    transferirParaConta(conta,contaDestino);
                    break;

                case 4:
                    conta.imprimirExtrato();
                    break;

                case 0:
                    System.out.println("Sair...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
               
        }    while (opcao != 0);

        }

        
        
}
        



