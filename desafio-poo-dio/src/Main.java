import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
    Curso logicaProgramacao = new Curso(8, "Curso Lógica de Programação", "Descrição curso Lógica de Programação");   
    Curso java = new Curso(8, "Curso Java POO", "Descrição curso Java POO");
    Curso javaScript = new Curso(4, "Curso JavaScript", "Descrição curso javaScript");
    Curso kotlin = new Curso(6, "Curso Kotlin", "Descrição curso Kotlin");

    Mentoria javaMentoria = new Mentoria(LocalDate.now(), "Mentoria de Java", "Descrição mentoria Java");
    Mentoria javaScriptMentoria = new Mentoria(LocalDate.now(), "Mentoria de JavaScript", "Descrição mentoria JavaScript");
    Mentoria kotlinMentoria = new Mentoria(LocalDate.now(), "Mentoria de Kotlin", "Descrição mentoria Kotlin");

    Bootcamp bootcampJava = new Bootcamp("Java Bootcamp Developer", "Descrição Bootcamp Java Developer");
    bootcampJava.getConteudos().add(logicaProgramacao);
    bootcampJava.getConteudos().add(java);
    bootcampJava.getConteudos().add(javaMentoria);
    bootcampJava.getConteudos().add(javaScript);
    bootcampJava.getConteudos().add(javaScriptMentoria);

    Bootcamp bootcampDevMobile = new Bootcamp("Bootcamp Mobile Developer", "Descrição Bootcamp Mobile Developer");
    bootcampDevMobile.getConteudos().add(logicaProgramacao);
    bootcampDevMobile.getConteudos().add(java);
    bootcampDevMobile.getConteudos().add(javaMentoria);
    bootcampDevMobile.getConteudos().add(kotlin);
    bootcampDevMobile.getConteudos().add(kotlinMentoria);

    Dev devAluno1 = new Dev("Aluno 1");
    devAluno1.inscreverBootcamp(bootcampJava);
    System.out.println("Conteúdos Inscritos '" + devAluno1.getNome() + "': " + devAluno1.getConteudosInscritos());
    System.out.println("XP: " + devAluno1.calcularTotalXp());
    devAluno1.progredir();
    devAluno1.progredir();
    System.out.println("----------");
    System.out.println("Conteúdos Concluidos '" + devAluno1.getNome() + "': " + devAluno1.getConteudosConcluidos());
    System.out.println("XP: " + devAluno1.calcularTotalXp());  

    System.out.println("**************************");

    Dev devAluno2  = new Dev("Aluno 2");
    devAluno2.inscreverBootcamp(bootcampDevMobile);
    System.out.println("Conteúdos Inscritos '" + devAluno2.getNome() + "': " + devAluno2.getConteudosInscritos());
    System.out.println("XP: " + devAluno2.calcularTotalXp());
    devAluno2.progredir();
    devAluno2.progredir();
    devAluno2.progredir();
    devAluno2.progredir();
    System.out.println("----------");
    System.out.println("Conteúdos Concluidos '" + devAluno2.getNome() + "': " + devAluno2.getConteudosConcluidos());
    System.out.println("XP: " + devAluno2.calcularTotalXp());  


    }
}
