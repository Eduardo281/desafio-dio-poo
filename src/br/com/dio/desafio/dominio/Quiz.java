package br.com.dio.desafio.dominio;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

public class Quiz {
    private Set<String> assuntos = new HashSet<>();
    private Set<Pergunta> perguntas = new HashSet<>();
    
    public Set<String> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(Set<String> assuntos) {
        this.assuntos = assuntos;
    }

    public Set<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(Set<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return Objects.equals(assuntos, quiz.assuntos)  && 
               Objects.equals(perguntas, quiz.perguntas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            assuntos, 
            perguntas
        );
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "assuntos='" + getAssuntos() + '\'' +
                ", perguntas='" + getPerguntas() + '\'' +
                '}';
    }
}
