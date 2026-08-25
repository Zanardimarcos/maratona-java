package com.zanardimarcos.maratojava.sobrecarga;

public class Anime {

    private String nome;
    private String sobrenome;
    private int epsodios;
    private String genero;

// construtor, serve para inicializar um objeto ja recebendo algum parametro
    public Anime(String nome, int ep, String genero){
        this.nome = nome;
        this.epsodios = ep;
        this.genero = genero;
    }


//metodo para instanciar o objeto
    public void init(String nome, int epsodios){
        this.nome = nome;
        this.epsodios = epsodios;
    }


//metodo que é um sobrecarga do metodo init, que acrescenta mais alguma instancia ao objeto
    public void init(String nome,String sobrenome, int epsodios, String genero){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.epsodios = epsodios;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "epsodios=" + epsodios +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
