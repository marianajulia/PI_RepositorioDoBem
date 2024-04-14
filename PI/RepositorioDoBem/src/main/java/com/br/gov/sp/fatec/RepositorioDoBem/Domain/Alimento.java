package com.br.gov.sp.fatec.RepositorioDoBem.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Alimento {

    @Id
    private String alimentoId;
    private  String nome;
    private  double peso;
    private  int quantidade;
    private  String validade;

    public Alimento(String alimentoId ,String nome, double peso, int quantidade, String validade) {
        super();
        this.alimentoId = alimentoId;
        this.nome = nome;
        this.peso = peso;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public String getAlimentoId() {
        return alimentoId;
    }

    public void setAlimentoId(String alimentoId) {
        this.alimentoId = alimentoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
