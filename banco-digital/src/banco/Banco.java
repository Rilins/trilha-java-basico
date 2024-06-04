package banco;
import java.util.ArrayList;
import java.util.List;
import banco.contas.Conta;

public class Banco {
    
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    } 
    
    private List<String> listarContas(){
        List<String> lista = new ArrayList<>();

        if(contas.isEmpty()){
            lista.add("sem contas");
        }else{
            for (Conta conta : contas) {
                lista.add("Numero: " + conta.getNumero() + "  Agência: " + conta.getAgencia() + "\n");
            }
        }
        return lista;
    }

    public void imprimirInfoBanco() {
        System.out.println("------------------------------------------");
        System.out.println("Bem vindo(a) ao Desafio Banco Digital");
        System.out.println("Número total de contas é: " + contas.size());
        System.out.println("------------------------------------------");
        System.out.println(listarContas());
    }


    public List<Conta> getContas() {
        return contas;
    }

    public Conta procurarConta(int numeroConta) {
       for (Conta conta : contas){
        if(conta.getNumero() == numeroConta){
            return conta;
        }else{
           System.out.println("Número não encontrado"); 
        }
       }
       return null;
        
    }

    
}
