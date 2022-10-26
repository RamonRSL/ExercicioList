package br.com.newtonpaiva.exercicioFixacao2ex3;

import java.util.ArrayList;

public class Agencia {
    private String nome;

    public Agencia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    ArrayList<Moto> list = new ArrayList<>();

    public void Adicionarmoto(Moto m){
        list.add(m);
    }

    public int quantidadeMoto;
    return list.size();

    public double SomaTotal(){
        double somaTotal=0;

        for ( int i=0; i< list.size();i++ ){
            Moto m = list.get(i);
            somaTotal+=m.getValor();
        }
        return somaTotal;
    }

}
