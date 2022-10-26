package br.com.newtonpaiva.exercicioFixacao2ex2;

import java.util.ArrayList;

public class Sacolao {
    private String nome;

    public Sacolao(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    ArrayList<Fruta> list = new ArrayList<>();

    public void AdicionarFruta(Fruta f){
        list.add(f);
    }

    public int quantidadefruta(){
        return list.size();
    }

    public double CalcularPreço(){

        double somaTotal=0;

        for ( int i=0; i< list.size();i++ ){
            Fruta f = list.get(i);
            somaTotal+=f.getValor();
        }
        return somaTotal;

    }
}
