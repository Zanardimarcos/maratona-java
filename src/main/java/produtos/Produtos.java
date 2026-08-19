package produtos;

import java.util.List;

public class Produtos {

    private String nome;
    private int quantidade;
    private int id;

    public Produtos(String nome ,int quantidade ){
         this.nome = nome;
         this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarProduto(){

    }

    @Override
    public String toString() {
        return "Produtos{nome = '" + nome + '\'' +
                ", quantidade = " + quantidade +
                '}';
    }
}
