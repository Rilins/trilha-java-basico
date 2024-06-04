package banco.contas;

public interface interConta {
    
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor,Conta ContaDestino);

    void imprimirExtrato();
    
} 