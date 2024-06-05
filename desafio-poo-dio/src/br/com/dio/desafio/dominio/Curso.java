package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    //Atributos 
    private int cargaHoraria;

    public Curso(int cargaHoraria, String nomeCurso, String info) {
        this.cargaHoraria = cargaHoraria;
        setTitulo(nomeCurso);
        setDescricao(info);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria; 
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo= '" + getTitulo() + "', descricao= '" + getDescricao() + "' , cargaHoraria= '" + cargaHoraria + "']";
    }

}
