package aparelhos;

import funcoes.NavegadorInternet;

public class Notebook implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página atual no Notebook: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo Nova aba no Notebook.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Notebook");
    }
    
}
