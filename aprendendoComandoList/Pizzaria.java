package br.com.newtonpaiva.aprendendoComandoList;
import java.util.Scanner;
public class Pizzaria {


    public static void main (String [] Args) {
        double nome;
        int ped;

        String ing;
        Scanner ler = new Scanner(System.in);

        Cliente c1 = new Cliente();
        Pizza pz = new Pizza();

        System.out.println("Seja Bem-vindo a Pizzaria Casa Nostra.");
        System.out.println("Informe seu nome: ");
        c1.nome=ler.nextLine();

        System.out.println("Qual o sabor de pizza que o Sr(a) deseja " + c1.getNome() + " ? ");
        System.out.println("1- Mussarela.\n2-Bacon\n3-Presunto\n4-Frango\n5-Requeijão\n6-Possui Borda\n7-Deseja outra Pizza?\n8-Finalizar ");

        ped=ler.nextInt();

        switch (ped) {
            case 1:
                System.out.println("A opção selecionada foi Mussarela.");
                System.out.println(c1.getNome() + " Observe abaixo:\n Tamanho G ( Digite -G-)\n Tamanho M (Digite -M-)\n Tamanho P (Digite -P-)\n São as opções de tamanho que posuimos, qual o tamanho desejado?");
                String teste = ler.nextLine();
                pz.setTamanho(teste);
                //System.out.println(c1.getNome() + "Gostaria de borda recheada?");
                break;

            case 2:
                System.out.println("A opção selecionada foi Bacon.");
                System.out.println(c1.getNome() + " Observe abaixo:\n Tamanho G ( Digite -G-)\n Tamanho M (Digite -M-)\n Tamanho P (Digite -P-)\n São as opções de tamanho que posuimos, qual o tamanho desejado?");
                //String teste = ler.nextLine();
                //pz.setTamanho(teste);
                //System.out.println(c1.getNome() + "Gostaria de borda recheada?");
                break;

            case 3:
                System.out.println("A opção selecionada foi Presunto.");
                System.out.println(c1.getNome() + " Observe abaixo:\n Tamanho G ( Digite -G-)\n Tamanho M (Digite -M-)\n Tamanho P (Digite -P-)\n São as opções de tamanho que posuimos, qual o tamanho desejado?");
               // String teste = ler.nextLine();
               // pz.setTamanho(teste);
                //System.out.println(c1.getNome() + "Gostaria de borda recheada?");
                break;

            case 4:
                System.out.println("A opção selecionada foi Frango.");
                System.out.println(c1.getNome() + " Observe abaixo:\n Tamanho G ( Digite -G-)\n Tamanho M (Digite -M-)\n Tamanho P (Digite -P-)\n São as opções de tamanho que posuimos, qual o tamanho desejado?");
               // String teste = ler.nextLine();
               // pz.setTamanho(teste);
                //System.out.println(c1.getNome() + "Gostaria de borda recheada?");
                break;

            case 5:
                System.out.println("A opção selecionada foi Requeijão.");
                System.out.println(c1.getNome() + " Observe abaixo:\n Tamanho G ( Digite -G-)\n Tamanho M (Digite -M-)\n Tamanho P (Digite -P-)\n São as opções de tamanho que posuimos, qual o tamanho desejado?");
               // String teste = ler.nextLine();
               // pz.setTamanho(teste);
                //System.out.println(c1.getNome() + "Gostaria de borda recheada?");
                break;

            case 6:
                System.out.println("Deseja Borda recheada? ");
                break;

            case 7:
                break;
        }

    }
}
