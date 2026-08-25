package com.zanardimarcos.maratojava.sobrecarga;

public class TesteSobrecarga {

    static void main(String[] args) {
        //instaciando objeto pelo construtor
        Anime anime = new Anime("naruto", 2,"masculino");
        System.out.println(anime);

        //chamando metodo que altera o nome e ep passado pelo construtor
        anime.init("saske",12);
        System.out.println(anime);

        //chamando metodo sobrecarga do metodo inicial com novos parametros
        anime.init("Sakura","susuke",15,"feminino");
        System.out.println(anime);


    }

}
