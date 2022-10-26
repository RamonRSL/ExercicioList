package br.com.newtonpaiva.exercicioFixacao2;

public class Carro {

    private String nome, cor;
    private double valor;

    public Carro(String nome, String cor, double valor) {
        this.nome = nome;
        this.cor = cor;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
