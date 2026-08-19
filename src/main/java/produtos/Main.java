package produtos;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        List<Produtos> produtos = new ArrayList<>();
        produtos.add(new Produtos("barco",20));
        produtos.add(new Produtos("moto",30));
        produtos.add(new Produtos("carro",35));
        produtos.removeIf(p -> p.getNome().equals("moto"));
        produtos.stream().forEach(System.out::println);

        for(Produtos l : produtos){

                if(l.getNome().equals("carro")){
                    System.out.println(l);
                }


        }




    }




        //for (Produtos p : produtos){
            //if(p.getQuantidade() <= 20){
               // System.out.println("quantidade inferior que 20 = " + p);
           // }




        //produtos.remove(produtos.equals("moto"));


    }














