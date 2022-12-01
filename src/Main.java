import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Link;
import br.com.dio.desafio.dominio.Mensagem;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        System.out.println();

        Link linkJava = new Link();
        linkJava.setTitulo("Site oficial Java pt-br");
        linkJava.setUrl("https://www.java.com/pt-BR/");
        
        bootcamp.getLinksUteis().add(linkJava);
        
        for (Link link : bootcamp.getLinksUteis()) {
            System.out.println(link);
            System.out.println();
        }

        Mensagem mensagem = new Mensagem();
        mensagem.setAutor(devJoao);
        mensagem.setTitulo("Qual é uma boa IDE para Java?");
        mensagem.setConteudo("Estou começando a estudar desenvolvimento Java e gostaria de indicações de uma boa IDE para trabalhar com esta linguagem. Agradeço desde já!");
        Set<String> assuntoMsg = new HashSet<>();
        assuntoMsg.add("Java");
        assuntoMsg.add("IDE");
        assuntoMsg.add("Linguagens de Programação");
        mensagem.setAssuntos(assuntoMsg);

        System.out.println(mensagem);
    }
}
