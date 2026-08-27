package com.zanardimarcos.maratojava.Fmodificadorestatico.teste;

import com.zanardimarcos.maratojava.Fmodificadorestatico.domain.Carro;

public class CarroTeste01 {
    static void main(String[] args) {

        Carro c1 = new Carro("bmw",290);
        Carro c2 = new Carro("mercedes",275);
        Carro c3 = new Carro("bugy",260);

        //alterando todos os objetosexistentes de carro
        Carro.velocidadeLimite = 150;//Modificador static

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
