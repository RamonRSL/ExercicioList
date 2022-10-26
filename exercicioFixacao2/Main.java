package br.com.newtonpaiva.exercicioFixacao2;

public class Main {
    public static void main (String [] Args){

        String nome = null, cor = null;

        Carro c1 = new Carro("Palio","Cinza", 40200);
        Carro c2 = new Carro("Gol","Preto" , 65030);
        Carro c3 = new Carro("Fiesta", "Preto", 45001.5);

        Agencia ag = new Agencia("-Agencia Firmes-");
        ag.AdicionarCarro(c1);
        ag.AdicionarCarro(c2);
        ag.AdicionarCarro(c3);

        int quatidade = ag.QuantidadeCarro();
        System.out.println("\n\n\nA Agencia de carro " + ag.getNome() + " Possui " + ag.QuantidadeCarro() + " Carros");

        System.out.println(ag.CalcularPreco());

    }
}
