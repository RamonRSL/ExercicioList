package br.com.newtonpaiva.exercicioFixacao2ex2;

public class Main {
    public static void main (String [] Args){

        Fruta f1 = new Fruta("Uva",13.10);
        Fruta f2 = new Fruta("Melancia", 5.78);
        Fruta f3 = new Fruta("Banana", 3.48);

        Sacolao s = new Sacolao("-Sacolao ABC-");

        s.AdicionarFruta(f1);
        s.AdicionarFruta(f2);
        s.AdicionarFruta(f3);

        System.out.println("\n\n\n\nO sacolao " + s.getNome() + " possui atualmente " + s.quantidadefruta() + " frutas");

        System.out.println("O valor total de veiculos da agencia de carro é: " + s.CalcularPreço());

    }
}
