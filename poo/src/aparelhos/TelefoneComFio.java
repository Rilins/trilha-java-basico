package aparelhos;

import funcoes.AparelhoTelefonico;

public class TelefoneComFio implements AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero + "Com Telefone com fio.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo com o Telefone com fio.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Telefone com fio");
    }

    
    
}
