package DesafioHeranca;

import java.util.Scanner;

public class Ninja{
    Scanner scan = new Scanner(System.in);
//variaveis de controle
    static int contagem;
    static int maximoDeNinjas = 3;
    static int numeroDoNinja;

//array de dados dos ninjas
static String[] nome = new String[maximoDeNinjas];
    static int[] idade = new int[maximoDeNinjas];
    static String[] missao = new String[maximoDeNinjas];
    static String[] nivelDeDificuldade = new String[maximoDeNinjas];
    static String[] statusDaMissao = new String[maximoDeNinjas];


    public static void mostrarInformacoesTodosOsNinjas() {
        Uchiha.mostrarInformacoesTodosOsNinjas();



    }
    public void RegistrarNinja() {

        ListarClas();
        if (contagem==maximoDeNinjas) {
            System.out.println("Limite de Ninjas atingido, escolha outra opção");

        }else {
            System.out.println("Escolha um Clã para o seu Ninja: ");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("==== Registre seu Ninja Uchiha ====");
                    scan.nextLine();
                    System.out.print("Nome:");
                    Uchiha.nome[Uchiha.contagemUchiha] = scan.nextLine();
                    System.out.print("Idade: ");
                    Uchiha.idade[Uchiha.contagemUchiha] = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Missão: ");
                    Uchiha.missao[Uchiha.contagemUchiha] = scan.nextLine();
                    System.out.print("Dificuldade: ");
                    Uchiha.nivelDeDificuldade[Uchiha.contagemUchiha] = scan.nextLine();
                    System.out.print("Status: ");
                    Uchiha.statusDaMissao[Uchiha.contagemUchiha] = scan.nextLine();
                    Uchiha.contagemUchiha++;
                    contagem = contagem + 1;

                    break;
                case 2:
                    System.out.println("==== Registre seu Ninja Uzumaki ====");
                    scan.nextLine();
                    System.out.print("Nome:");
                    Uzumaki.nome[Uzumaki.contagemUzumaki] = scan.nextLine();
                    System.out.print("Idade: ");
                    Uzumaki.idade[Uzumaki.contagemUzumaki] = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Missão: ");
                    Uzumaki.missao[Uzumaki.contagemUzumaki] = scan.nextLine();
                    System.out.print("Dificuldade: ");
                    Uzumaki.nivelDeDificuldade[Uzumaki.contagemUzumaki] = scan.nextLine();
                    System.out.print("Status: ");
                    Uzumaki.statusDaMissao[Uzumaki.contagemUzumaki] = scan.nextLine();
                    Uzumaki.contagemUzumaki++;
                    contagem++;

                    break;
                default:
                    System.out.println("Opção Inválida, escolha um Clã da Lista!");
                    RegistrarNinja();
                    break;
            }
        }
    }


    public void ListarClas(){
        String[] clas = new String[2];
        clas[0] = Uchiha.ClaDoNinja;
        clas[1] = Uzumaki.ClaDoNinja;
        System.out.println("=== Lista de Clãs ===");
        for (int i = 0; i < 2;i++){
            System.out.println(i+1 +"-"+clas[i]);
        }

    }
}