package br.com.dio.desafio.dominio;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Pergunta {
    private String enunciado;
    private Map<Integer, String> alternativas = new LinkedHashMap<>();
    private int alternativaCorreta;
    private Set<String> assuntos = new HashSet<>();

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Map<Integer, String> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Map<Integer, String> alternativas) {
        this.alternativas = alternativas;
    }

    public int getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public void setAlternativaCorreta(int alternativaCorreta) {
        this.alternativaCorreta = alternativaCorreta;
    }

    public Set<String> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(Set<String> assuntos) {
        this.assuntos = assuntos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pergunta pergunta = (Pergunta) o;
        return Objects.equals(enunciado, pergunta.enunciado) && Objects.equals(alternativas, pergunta.alternativas) && Objects.equals(alternativaCorreta, pergunta.alternativaCorreta) && Objects.equals(assuntos, pergunta.assuntos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enunciado, alternativas, alternativaCorreta, assuntos);
    }

    @Override
    public String toString() {
        return "Pergunta{" +
                "enunciado='" + getEnunciado() + '\'' +
                ", alternativas='" + getAlternativas() + '\'' +
                ", alternativaCorreta=" + getAlternativaCorreta() + '\'' +
                ", assuntos=" + getAssuntos() + '\'' +
                '}';
    }
}
