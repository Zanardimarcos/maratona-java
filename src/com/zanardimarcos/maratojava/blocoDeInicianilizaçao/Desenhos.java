package com.zanardimarcos.maratojava.blocoDeInicianilizaçao;

public class Desenhos {

    private String nome;
    private int[] epsodios;
    {
        // 1-alocado espaco em memoria
        // 2-atributo da classe criado com seu valor ou default se nao tiver nada ex de default o nome e ep dessa classe
        // 3-bloco de inicializaçao de instacia,é executado toda vez que esse objeto é criado
        //4-executado antes do construtor

        System.out.println("Dentro de bloco de inicializaçao");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length ; i++) {
            epsodios[i] = i + 1;// i + 1 so para ir de 1 a 100 na impresao ser for so i vai de 0 a 99
        }

    }
    public Desenhos(String nome) {
        this.nome = nome;
    }

    public Desenhos() {

        for(int ep : this.epsodios){
            System.out.print(ep + " ");
        }
        System.out.println();
    }
    

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }
}

