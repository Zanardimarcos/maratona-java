package com.zanardimarcos.maratojava.Fmodificadorestatico.domain;

public class Carro {
    private  String nome;
    private double velocidadeMaxima;
    public static  double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + this.getNome() + '\'' +
                ", velocidadeMaxima=" + this.getVelocidadeMaxima() +
                " velocidade limite " + Carro.velocidadeLimite + //nao pode ser usado this na varialvel/modificador de acesso static
                '}';                                            //static velocidadelimite pertence a classe carro, modifica todas as instancia do objeto carro
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    
}
