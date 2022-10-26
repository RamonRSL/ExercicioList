package br.com.newtonpaiva.aprendendoComandoList;
import java.util.Random;
public class Pedido {

    int pedido;
    String data;
    String cliente;
    String listaPizza;
    Random rand = new Random();

    Pizza pz = new Pizza();

    public void ValorPizza(){


    }

    public String ResumoPedido(){
        return "Pedido: " + (pedido=rand.nextInt(999)) + "/nCliente: " + cliente + "/nQuantidade de Pizza: " + listaPizza + "/nValor total do pedido: ";
    }


}
