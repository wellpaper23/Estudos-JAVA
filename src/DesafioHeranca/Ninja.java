package DesafioHeranca;

import java.util.Scanner;

public class Ninja{
    static Uchiha ClaUchiha = new Uchiha();
    static Uzumaki ClaUzumaki = new Uzumaki();
    public static void ListarClas(){

        String[] clas = new String[2];
        clas[0] = ClaUchiha.ClaDoNinja;
        clas[1] = ClaUzumaki.ClaDoNinja;
        for (int i = 0; i < 2;i++){
            System.out.println(clas[i]);
        }
    }



    int contagem;
    int maximoDeNinjas = 3;
    int numeroDoNinja;

    String[] nome = new String[maximoDeNinjas];
    int[] idade = new int[maximoDeNinjas];
    String[] missao = new String[maximoDeNinjas];
    String[] nivelDeDificuldade = new String[maximoDeNinjas];
    String[] statusDaMissao = new String[maximoDeNinjas];


    public void mostrarInformacoes() {
        System.out.println("nome = " + nome[numeroDoNinja]);
        System.out.println("idade = " + idade[numeroDoNinja]);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade[numeroDoNinja]);
        System.out.println("Status da Missao = " + statusDaMissao[numeroDoNinja]);
        System.out.println("Missao = " + missao[numeroDoNinja]);
    }
    public void RegistrarNinja() {
        ListarClas();
        Scanner scanNinja = new Scanner(System.in);
        String EntradaoClaDoNinja = scanNinja.nextLine();
        if (EntradaoClaDoNinja == ClaUchiha.ClaDoNinja) {
            System.out.println("==== Registre seu Ninja Uchiha ====");
            System.out.print("Nome:");
            ClaUchiha.nome[contagem] = scanNinja.nextLine();
            System.out.print("Idade: ");
            ClaUchiha.idade[contagem] = scanNinja.nextInt();
            scanNinja.nextLine();
            System.out.print("Missão: ");
            ClaUchiha.missao[contagem] = scanNinja.nextLine();
            contagem++;
            scanNinja.close();
        }
    }

}