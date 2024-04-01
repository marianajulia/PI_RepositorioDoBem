package com.fatec.sp.gov.br.RepositorioDoBem.Builder;

public class Alimento{
    private final String nome;
    private final double peso;
    private final int quantidade;
    private final String validade;
    
    private Alimento(Builder builder){
        this.nome=builder.nome;
        this.peso=builder.peso;
        this.quantidade=builder.quantidade;
        this.validade=builder.validade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public String toString(){
        return  "Nome: " + getNome() + '\n' +
                "Peso: " + getPeso() + '\n' +
                "Quantidade: " + getQuantidade() + '\n' +
                "Validade: " + getValidade();
    }

    public static class Builder{
        private String nome;
        private double peso;
        private int quantidade;
        private String validade;

        pubilc Builder nome(String nome){
            this.nome = nome;
            return this;
        }

        public Builder peso(double peso){
            this.peso = peso;
            return this;
        }

        public Builder quantidade(int quantidade){
            this.quantidade = quantidade;
            return this;
        }

        public Builder validade(String validade){
            this.validade = validade;
            return this;
        }

        public Alimento build(){
            return new Alimento(this);
        }
    }
}