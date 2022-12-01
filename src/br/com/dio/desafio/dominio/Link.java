package br.com.dio.desafio.dominio;

public class Link {
    private String titulo;
    private String url;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Link{" +
                "titulo='" + getTitulo() + '\'' +
                ", url='" + getUrl() + '\'' +
                '}';
    }
}
