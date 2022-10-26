package br.com.newtonpaiva.aprendendoComandoList;
import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String nome;
    private double valor;
    private String tamanho;
    private boolean possuiBordaRecheada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho( String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean getPossuiBordaRecheada() {
        return possuiBordaRecheada;
    }

    public void setPossuiBordaRecheada(boolean possuiBordaRecheada) {
        this.possuiBordaRecheada = possuiBordaRecheada;
    }

    List lista = new ArrayList<Ingrediente>();

    public int QtdeIngredientes (){
        return lista.size();

    }
    public void AdicionarElemento(Ingrediente ing){
        lista.add(ing);
    }


    public void CalculaValorPizza(){

        if (getTamanho().equals("G")){
            setValor(45);
        }
        if (getTamanho().equals("M")){
            setValor(30);
        }
        if (getTamanho().equals("P")){
            setValor(20);
        }
        if (lista.size()>5){
            this.valor=this.valor + 5;
        }
        if (possuiBordaRecheada==true){
            valor= valor + 8;
        }
    }
}