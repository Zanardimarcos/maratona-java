package com.zanardimarcos.maratojava.blocoDeInicianilizaçao;

public class Teste {
    static void main(String[] args) {

        //Se passar paramentro de nome vai entrar em um construtor
        // Se nao passar nenhum parametro entra em outro construtor que imprimir os epsodios ate  100 tbm.
        Desenhos desenho = new Desenhos();

        for (int epsodio : desenho.getEpsodios()) {
            System.out.print(epsodio + " ");
        }

    }
}
