package aparelhos;

import funcoes.ReprodutorMusical;

public class Mp3Player implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando a música no Mp3Player");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no Mp3Player");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica + " no Mp3Player");
    }

    
    
}
