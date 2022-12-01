package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mensagem {
    private String conteudo;
    private Dev autor;
    private final LocalDate data = LocalDate.now();

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

    @Override
    public String toString() {
        return "Mensagem{" +
                ", conteudo='" + getConteudo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", data='" + getData() + '\'' +
                '}';
    }
}
