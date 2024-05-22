import aparelhos.Iphone;
import aparelhos.Mp3Player;
import aparelhos.Notebook;
import aparelhos.TelefoneComFio;
import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class meuAparelho {
    public static void main(String[] args) {
        
        Iphone iPhone13 = new Iphone();
        iPhone13.ligar("(51) 1234-5678");
        iPhone13.exibirPagina("https://www.dio.me");
        iPhone13.selecionarMusica("easy.mp3");

        TelefoneComFio intelbras = new TelefoneComFio();
        intelbras.ligar("(51) 1234-5678");

        Mp3Player mP4 = new Mp3Player();
        mP4.selecionarMusica("easy.mp3");

        Notebook acerAspire = new Notebook();
        acerAspire.exibirPagina("https://www.dio.me");

        /* 
        AparelhoTelefonico celular = iPhone13;
        celular.atender();
        
        NavegadorInternet edge = iPhone13;
        edge.adicionarNovaAba();

        ReprodutorMusical radio = iPhone13;
        radio.tocar();

        Iphone iphone8 = iPhone13;
        iphone8.iniciarCorreioVoz();
        iphone8.atualizarPagina();
        iphone8.pausar();
 */
    }
}
