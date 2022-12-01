import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Link;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Pergunta;
import br.com.dio.desafio.dominio.Postagem;
import br.com.dio.desafio.dominio.Quiz;
import br.com.dio.desafio.dominio.Resposta;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
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

        Postagem postagem = new Postagem();
        postagem.setAutor(devJoao);
        postagem.setTitulo("Qual é uma boa IDE para Java?");
        postagem.setConteudo("Estou começando a estudar desenvolvimento Java e gostaria de indicações de uma boa IDE para trabalhar com esta linguagem. Agradeço desde já!");
        Set<String> assuntoMsg = new HashSet<>();
        assuntoMsg.add("Java");
        assuntoMsg.add("IDE");
        assuntoMsg.add("Linguagens de Programação");
        postagem.setAssuntos(assuntoMsg);
        bootcamp.getForum().getPostagens().add(postagem);

        System.out.println(postagem);
        System.out.println();

        Resposta resposta = new Resposta();
        resposta.setAutor(devCamila);
        resposta.setConteudo("Eu uso o IntelliJ no meu dia a dia e super recomendo! É uma ótima IDE com diversas funcionalidades extremamente úteis para o desenvolvimento em Java. Facilita muito o meu trabalho e me ajuda a ter o máximo de produtividade!");
        resposta.setPostagemAssociada(postagem);
        resposta.receberLike();

        System.out.println(resposta);
        System.out.println();

        for (Postagem p : bootcamp.getForum().getPostagens()) {
            System.out.println(p);
        }
        System.out.println("+++---+++---+++---+++---");
        System.out.println();

        Pergunta pergunta1 = new Pergunta();
        Set<String> assuntoPergunta1 = new HashSet<>();
        assuntoPergunta1.add("Java");
        pergunta1.setAssuntos(assuntoPergunta1);
        pergunta1.setEnunciado("Qual das seguintes linhas de código imprime a mensagem \"Hello, World\" em Java?");
        Map<Integer, String> alternativasPergunta1 = new LinkedHashMap<>();
        alternativasPergunta1.put(1, "print(\"Hello, World\")");
        alternativasPergunta1.put(2, "IO.puts(\"Hello, World\")");
        alternativasPergunta1.put(3, "System.out.println(\"Hello, World\");");
        alternativasPergunta1.put(4, "std::cout << \"Hello, World\" << std::endl;");
        pergunta1.setAlternativas(alternativasPergunta1);
        pergunta1.setAlternativaCorreta(3);
        System.out.println(pergunta1);
        System.out.println();

        Pergunta pergunta2 = new Pergunta();
        Set<String> assuntoPergunta2 = new HashSet<>();
        assuntoPergunta2.add("Java");
        pergunta2.setAssuntos(assuntoPergunta2);
        pergunta2.setEnunciado("Qual das alternativas abaixo não representa um tipo numérico em Java");
        Map<Integer, String> alternativasPergunta2 = new LinkedHashMap<>();
        alternativasPergunta2.put(1, "int");
        alternativasPergunta2.put(2, "float");
        alternativasPergunta2.put(3, "String");
        alternativasPergunta2.put(4, "double");
        pergunta2.setAlternativas(alternativasPergunta2);
        pergunta2.setAlternativaCorreta(3);
        System.out.println(pergunta2);
        System.out.println();

        Pergunta pergunta3 = new Pergunta();
        Set<String> assuntoPergunta3 = new HashSet<>();
        assuntoPergunta3.add("IDE");
        pergunta3.setAssuntos(assuntoPergunta3);
        pergunta3.setEnunciado("Dadas as alternativas\n1 - VS Code;\n2 - IntelliJ;\n3 - Eclipse;\n"+
        "Quais representam editores de código com suporte à linguagem Java?");
        Map<Integer, String> alternativasPergunta3 = new LinkedHashMap<>();
        alternativasPergunta3.put(1, "Apenas 1 e 3");
        alternativasPergunta3.put(2, "Apenas 1 e 2");
        alternativasPergunta3.put(3, "Apenas 2 e 3");
        alternativasPergunta3.put(4, "Todas as três opções");
        pergunta3.setAlternativas(alternativasPergunta3);
        pergunta3.setAlternativaCorreta(4);
        System.out.println(pergunta3);
        System.out.println();

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Quiz quiz = new Quiz();
        Set<String> assuntosQuiz = new HashSet<>();
        assuntosQuiz.add("Java");
        assuntosQuiz.add("IDE");
        Set<Pergunta> perguntasQuiz = new HashSet<>();
        perguntasQuiz.add(pergunta1);
        perguntasQuiz.add(pergunta2);
        perguntasQuiz.add(pergunta3);
        quiz.setAssuntos(assuntosQuiz);
        quiz.setPerguntas(perguntasQuiz);
        System.out.println(quiz);
    }
}
