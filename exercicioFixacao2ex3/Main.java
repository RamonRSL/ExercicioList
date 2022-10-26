package br.com.newtonpaiva.exercicioFixacao2ex3;

public class Main {
    public static void main (String []Args){
        Moto m1= new Moto("Cg 160","prata", 17000);
        Moto m2= new Moto("fazer 250","preta", 24990);
        Moto m3= new Moto("Cb 1000","Azul", 43020);

        Agencia ag = new Agencia("-Yamaha Motos");
        ag.Adicionarmoto(m1);
        ag.Adicionarmoto(m2);
        ag.Adicionarmoto(m3);

        System.out.println("\n\n\n\nNa agencia " + ag.getNome() + " possui um valor total em veiculos de: " + ag.SomaTotal());

    }
}
