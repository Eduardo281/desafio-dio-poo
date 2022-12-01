package br.com.dio.desafio.dominio;

public class Resposta extends Mensagem{
    private Postagem postagemAssociada;
    private int      contadorDislikes;
    private int      contadorLikes;

    public Postagem getPostagemAssociada() {
        return postagemAssociada;
    }

    public void setPostagemAssociada(Postagem postagemAssociada) {
        this.postagemAssociada = postagemAssociada;
    }

    public int getContadorLikes() {
        return contadorLikes;
    }

    public void setContadorLikes(int contadorLikes) {
        this.contadorLikes = contadorLikes;
    }

    public int getContadorDislikes() {
        return contadorDislikes;
    }

    public void setContadorDislikes(int contadorDislikes) {
        this.contadorDislikes = contadorDislikes;
    }

    public void receberLike(){
        this.contadorLikes++;
    }

    public void receberDislike(){
        this.contadorDislikes++;
    }

    @Override
    public String toString() {
        return "Resposta{" +
                "postagemAssociada='" + getPostagemAssociada() + '\'' +
                "conteudo='" + getConteudo() + '\'' +
                "autor='" + getAutor() + '\'' +
                "data='" + getData() + '\'' +                
                ", contadorLikes='" + getContadorLikes() + '\'' +
                ", contadorDislikes='" + getContadorDislikes() + '\'' +
                '}';
    }
}
