package com.zanardimarcos.maratojava.criando;

import java.util.ArrayList;
import java.util.List;

public class ProdutoMain {
    static void main(String[] args) {

        List<Produtos> produtos = new ArrayList<>();
        produtos.add(new Produtos("teclado", 20,5));
        produtos.add(new Produtos("monitor",300,3));

        for(Produtos p : produtos){
            System.out.println(p);
        }

        System.out.println("Prod");


        Produtos maiorQuantidade = produtos.get(0);
        for (Produtos p : produtos){
            if(p.getQuantidade() > maiorQuantidade.getQuantidade()){
                maiorQuantidade = p;
            }

        }
        System.out.println("Produto com maior quantidade ");
        System.out.println(maiorQuantidade);
    }


}
