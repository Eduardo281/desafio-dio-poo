package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Mensagem {
    private String titulo;
    private String conteudo;
    private Dev autor;
    private final LocalDate data = LocalDate.now();
    private Set<String> assuntos = new HashSet<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Dev getAutor() {
        return autor;
    }

    public void setAutor(Dev autor) {
        this.autor = autor;
    }
    
    public LocalDate getData() {
        return data;
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
        Mensagem mensagem = (Mensagem) o;
        return Objects.equals(titulo, mensagem.titulo) && Objects.equals(conteudo, mensagem.conteudo) && Objects.equals(autor, mensagem.autor) && Objects.equals(data, mensagem.data) && Objects.equals(assuntos, mensagem.assuntos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, conteudo, autor, data, assuntos);
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "titulo='" + getTitulo() + '\'' +
                ", conteudo='" + getConteudo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", data='" + getData() + '\'' +
                ", assuntos='" + getAssuntos() + '\'' +
                '}';
    }
}
