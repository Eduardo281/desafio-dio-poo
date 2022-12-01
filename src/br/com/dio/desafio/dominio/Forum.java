package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Forum {
    private Set<Postagem> postagens = new LinkedHashSet<>();

    public Set<Postagem> getPostagens() {
        return postagens;
    }

    public void setPostagens(Set<Postagem> postagens) {
        this.postagens = postagens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Forum forum = (Forum) o;
        return Objects.equals(postagens, forum.postagens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postagens);
    }
}
