package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //static = para acessar fora da classe Conteudo,
    // está dizendo que nao faz parte da orientacao a objeto
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
