package br.com.newtonpaiva.exercicioFixacao2;
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

    ArrayList<Carro> listadeCarro= new ArrayList<Carro>();  //criando lista de carro do tipo carro

    public void AdicionarCarro (Carro c){                   // criando um metodo para adicionar na lista, tipo de carro
        listadeCarro.add(c);
    }

    public int QuantidadeCarro (){                          // retornando a quantidade de carro acrescentada
        return listadeCarro.size();
    }

    public double CalcularPreco(){
        double somaTotal=0.0;

        for (int i=0;i<listadeCarro.size();i++){
            Carro c = listadeCarro.get(i);
            somaTotal+=c.getValor();
        }
        return somaTotal;
    }

}
