package DesafioHeranca;

import java.util.Scanner;

public class Ninja{
    Uzumaki ClaUzumaki;
    Uchiha ClaUchiha;
    Scanner scan = new Scanner(System.in);
//variaveis de controle
int contagem;
    static int maximoDeNinjas = 3;
    //static int numeroDoNinja;

//array de dados dos ninjas
    String[] nome = new String[maximoDeNinjas];
    int[] idade = new int[maximoDeNinjas];
    String[] missao = new String[maximoDeNinjas];
    String[] nivelDeDificuldade = new String[maximoDeNinjas];
    String[] statusDaMissao = new String[maximoDeNinjas];


    public void mostrarInformacoesTodosOsNinjas() {
        try {
            if (ClaUzumaki.contagem > 0) {
                ClaUzumaki.mostrarInformacoesTodosOsNinjas();
            }

            if (ClaUchiha.contagem < 0) {
                ClaUchiha.mostrarInformacoesTodosOsNinjas();
            }
        }catch (NullPointerException exception){
ClaUchiha.mostrarInformacoesTodosOsNinjas();
        }


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
                    ClaUchiha.nome[ClaUchiha.contagem] = scan.nextLine();
                    System.out.print("Idade: ");
                    ClaUchiha.idade[ClaUchiha.contagem] = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Missão: ");
                    ClaUchiha.missao[ClaUchiha.contagem] = scan.nextLine();
                    System.out.print("Dificuldade: ");
                    ClaUchiha.nivelDeDificuldade[ClaUchiha.contagem] = scan.nextLine();
                    System.out.print("Status: ");
                    ClaUchiha.statusDaMissao[ClaUchiha.contagem] = scan.nextLine();
                    ClaUchiha.contagem++;
                    contagem = contagem + 1;

                    break;
                case 2:
                    System.out.println("==== Registre seu Ninja Uzumaki ====");
                    scan.nextLine();
                    System.out.print("Nome:");
                    ClaUzumaki.nome[ClaUzumaki.contagem] = scan.nextLine();
                    System.out.print("Idade: ");
                    ClaUzumaki.idade[ClaUzumaki.contagem] = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Missão: ");
                    ClaUzumaki.missao[ClaUzumaki.contagem] = scan.nextLine();
                    System.out.print("Dificuldade: ");
                    ClaUzumaki.nivelDeDificuldade[ClaUzumaki.contagem] = scan.nextLine();
                    System.out.print("Status: ");
                    ClaUzumaki.statusDaMissao[ClaUzumaki.contagem] = scan.nextLine();
                    ClaUzumaki.contagem++;
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
        clas[0] = ClaUchiha.ClaDoNinja;
        clas[1] = ClaUzumaki.ClaDoNinja;
        System.out.println("=== Lista de Clãs ===");
        for (int i = 0; i < 2;i++){
            System.out.println(i+1 +"-"+clas[i]);
        }

    }
}