package DesafioHeranca;
import java.util.Scanner;

public class Ninja {


    Scanner scan = new Scanner(System.in);
    static int contagem;
    static int maximoDeNinjas = 2;

    static String[] Nome = new String[maximoDeNinjas];
    static int[] Idade = new int[maximoDeNinjas];
    static String[] Missao = new String[maximoDeNinjas];
    static String[] nivelDificuldade = new String[maximoDeNinjas];
    static String[] statusMissao = new String[maximoDeNinjas];
    static String[] habilidadeEspecial = new String[maximoDeNinjas];


    public void Menu(){
        Uchiha uchiha = new Uchiha();
        boolean continuar = true;
        while (continuar){
            System.out.println("========Arquivo Ninja========");
            System.out.println("1-Adicionar Ninja");
            System.out.println("2-Mostrar Ninjas");
            System.out.println("3-Mostrar Habilidade Uchiha");
            System.out.println("4-Mudar habilidade especial do Ninja");
            System.out.println("5-Sair");
            int option;
            option = scan.nextInt();
            switch (option){
                case 1:
                    scan.nextLine();
                    registrarNinjas();
                    break;
                case 2:
                    mostrarInformacoes();
                    break;
                case 3:
                uchiha.mostrarInformacoes();

                    break;
                case 4:
                    alterarHabilidadeUchiha();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção indisponível, tente novamente!");
                    break;

            }
        }
    }

    public void registrarNinjas() {

        if (contagem == maximoDeNinjas) {
            System.out.println("Limite de Ninjas atingido");
        }
        else {

            System.out.print("Nome: ");
            Nome[contagem] = scan.nextLine();
            System.out.print("Idade: ");
            Idade[contagem] = scan.nextInt();
            scan.nextLine();
            System.out.print("Missao : ");
            Missao[contagem] = scan.nextLine();
            System.out.print("Dificuldade:");
            nivelDificuldade[contagem] = scan.nextLine();
            System.out.print("Status: ");
            statusMissao[contagem] = scan.nextLine();
            System.out.print("Habilidade especial Uchiha: ");
            habilidadeEspecial[contagem] = scan.nextLine();
            contagem++;
            System.out.println("===============================");
            System.out.println("Ninja registrado com sucesso!!");
        }
        //registrar na classe Ninja
    }
    public void alterarHabilidadeUchiha(){

        if (contagem == 0){
            System.out.println("Não há Ninjas para mudar a habilidade! Registre um Ninja");

        }else {
            ListarNinjas();
            System.out.println("De qual ninja deseja alterar a habilidade?");
            int option = scan.nextInt();
            scan.nextLine();


            if (option == 1) {
                //loop para iterar sobre o array e editar as habilidade de todos os Ninjas
                for (option = 0; option < contagem; option++){
                    System.out.println("-------------Editando Habilidade-------------");
                    System.out.println("Ninja: "+Nome[option]);
                    System.out.print("Nova habilidade: ");
                    String novaHabilidade = scan.nextLine();
                    habilidadeEspecial[option] = novaHabilidade;
                    System.out.println("Habilidade alterada!");

                }
                System.out.println("=================================================");

            }else if(option < 1 && option > contagem+1) {
                System.out.println("Ninja indisponível, tente novamente!");

            }else {

//somar 1 a contagem para igualar ao ultimo item da lista exibida
                //array      0 1 2 3
                //contagem   1 2 3 4
                //lista    1 2 3 4 5
                System.out.println("-------------Editando Habilidade-------------");
                // subtrair 2 da opção escolhida para igualar ao indice em que o ninja está no array
                System.out.println("Ninja: " + Nome[option - 2]);
                System.out.print("Nova habilidade: ");
                String novaHabilidade = scan.nextLine();
                habilidadeEspecial[option - 2] = novaHabilidade;
                System.out.println("Habilidade alterada!");
                }

        }

    }
//================================================================================================
    public void mostrarInformacoes(){
        if (contagem == 0){
            System.out.println("Não há Ninjas para exibir! Registre um Ninja");
            Menu();
        }else {
            ListarNinjas();
            System.out.println("Qual Ninja deseja exibir?");
            int option;
            option = scan.nextInt();
            scan.nextLine();
                if (option == 1) {
                    //loop para iterar sobre os arrays e exibir as informações de todos os Ninjas
                    System.out.println("================informações================");
                    for (option = 0; option < contagem; option++) {

                        System.out.println("Nome: " + Nome[option] + " - " + Idade[option] + " anos");
                        System.out.println("_______________________________________");
                        System.out.println("Missão: " + Missao[option]);
                        System.out.println("Dificuldade da missão: " + nivelDificuldade[option]);
                        System.out.println("Status da missão: " + statusMissao[option]);
                        System.out.println("=======================================");

                    }

                } else if (option > 1 && option <= contagem + 1) {
                    //somar 1 a contagem para igualar ao ultimo item da lista exibida
                    //array      0 1 2 3
                    //contagem   1 2 3 4
                    //lista    1 2 3 4 5
                    System.out.println("====================Ninja==================");
                    // subtrair 2 da opção escolhida para igualar ao indice em que o ninja está no array
                    System.out.println("Nome: " + Nome[option - 2] + " - " + Idade[option - 2] + " anos");
                    System.out.println("___________________________________________");
                    System.out.println("Missão: " + Missao[option - 2]);
                    System.out.println("Dificuldade da missão: " + nivelDificuldade[option - 2]);
                    System.out.println("Status da missão: " + statusMissao[option - 2]);
                    System.out.println("===========================================");



                } else {
                    System.out.println("Ninja indisponível, tente novamente");
                    mostrarInformacoes();


                }

        }

    }
    public void ListarNinjas(){
        System.out.println("======================");
        System.out.println("1-Todos");
        for (int i = 0; i < contagem;i++){
            System.out.println(i+2+"-"+Nome[i]);
        }
        System.out.println("======================");
    }


}
