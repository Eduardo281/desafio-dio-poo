package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Postagem extends Mensagem {
    private String titulo;
    private int qtdVisualizacoes;
    private int qtdRespostas;
    private Set<String> assuntos = new HashSet<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdVisualizacoes() {
        return qtdVisualizacoes;
    }

    public void setQtdVisualizacoes(int qtdVisualizacoes) {
        this.qtdVisualizacoes = qtdVisualizacoes;
    }

    public int getQtdRespostas() {
        return qtdRespostas;
    }

    public void setQtdRespostas(int qtdRespostas) {
        this.qtdRespostas = qtdRespostas;
    }

    public void incrementarVisualizacoes(){
        this.qtdVisualizacoes++;
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
        Postagem postagem = (Postagem) o;
        return Objects.equals(titulo, postagem.titulo)                     && 
               Objects.equals(qtdVisualizacoes, postagem.qtdVisualizacoes) && 
               Objects.equals(qtdRespostas, postagem.qtdRespostas)         && 
               Objects.equals(assuntos, postagem.assuntos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, qtdVisualizacoes, qtdRespostas, assuntos);
    }

    @Override
    public String toString() {
        return "Postagem{" +
                "titulo='" + getTitulo() + '\'' +
                "conteudo='" + getConteudo() + '\'' +
                "autor='" + getAutor() + '\'' +
                "data='" + getData() + '\'' +
                "qtdVisualizacoes='" + getQtdVisualizacoes() + '\'' +
                ", qtdRespostas='" + getQtdRespostas() + '\'' +
                ", assuntos='" + getAssuntos() + '\'' +
                '}';
    }
}
