package DesafioHeranca;

import java.util.Scanner;

public class Ninja{


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
    public  void RegistrarNinja() {
        Scanner scanNinja = new Scanner(System.in);
        ListarClas();
        System.out.println("Escolha um Clã para o seu Ninja: ");
        int option = scanNinja.nextInt();
        switch (option){
            case 1:
                System.out.println("==== Registre seu Ninja Uchiha ====");
                System.out.print("Nome:");
                ClaUchiha.nome[ClaUchiha.contagemUchiha] = scanNinja.nextLine();
                scanNinja.nextLine();
                System.out.print("Idade: ");
                ClaUchiha.idade[ClaUchiha.contagemUchiha] = scanNinja.nextInt();
                scanNinja.nextLine();
                System.out.print("Missão: ");
                ClaUchiha.missao[ClaUchiha.contagemUchiha] = scanNinja.nextLine();
                System.out.print("Dificuldade: ");
                ClaUchiha.nivelDeDificuldade[ClaUchiha.contagemUchiha] = scanNinja.nextLine();
                System.out.print("Status: ");
                ClaUchiha.statusDaMissao[ClaUchiha.contagemUchiha] = scanNinja.nextLine();
                ClaUchiha.contagemUchiha++;
                contagem ++;
                break;
            case 2:
                System.out.println("==== Registre seu Ninja Uzumaki ====");
                System.out.print("Nome:");
                ClaUzumaki.nome[ClaUzumaki.contagemUzumaki] = scanNinja.nextLine();
                System.out.print("Idade: ");
                ClaUzumaki.idade[ClaUzumaki.contagemUzumaki] = scanNinja.nextInt();
                scanNinja.nextLine();
                System.out.print("Missão: ");
                ClaUzumaki.missao[ClaUzumaki.contagemUzumaki] = scanNinja.nextLine();
                System.out.print("Dificuldade: ");
                ClaUzumaki.nivelDeDificuldade[ClaUzumaki.contagemUzumaki] = scanNinja.nextLine();
                System.out.print("Status: ");
                ClaUchiha.statusDaMissao[ClaUzumaki.contagemUzumaki] = scanNinja.nextLine();
                ClaUzumaki.contagemUzumaki++;
                contagem ++;
                break;
            default:
                System.out.println("Opção Inválida, escolha um Clã da Lista!");
                RegistrarNinja();
            break;
        }
            scanNinja.close();
    }



    static Uchiha ClaUchiha = new Uchiha();
    static Uzumaki ClaUzumaki = new Uzumaki();
    public static void ListarClas(){

        String[] clas = new String[2];
        clas[0] = ClaUchiha.ClaDoNinja;
        clas[1] = ClaUzumaki.ClaDoNinja;
        System.out.println("=== Lista de Clãs ===");
        for (int i = 0; i < 2;i++){
            System.out.println(i +"-"+clas[i]);
        }

    }
}