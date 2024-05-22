package aparelhos;

import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
    //Aparelho Telefonico
    public void ligar(String numero){
        System.out.println("Ligando para: " + numero + " com o iPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo no iPhone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone.");
    }

    //Navegador Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Página atual no iPhone: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo Nova aba no iPhone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no iPhone");
    }

    //Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando a música no iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no iPhone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica + " no iPhone");
    }

    

}
