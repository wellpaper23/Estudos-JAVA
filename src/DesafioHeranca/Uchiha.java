package DesafioHeranca;
public class Uchiha extends Ninja{




    public void mostrarInformacoes() {

        if (contagem == 0) {
            System.out.println("Não há Ninjas para exibir habilidade! Registre um Ninja.");

        }
        else{
            ListarNinjas();
            System.out.println("Qual Ninja deseja exibir habilidade Uchiha?");
            int option;
            option = scan.nextInt();
            scan.nextLine();

                if (option == 1) {
                    //loop para iterar sobre os arrays e exibir as habilidades de todos os Ninjas
                    System.out.println("======informações======");
                    for (option = 0; option < contagem; option++) {
                        System.out.println("Nome: " + Nome[option] + " - " + Idade[option] + " anos");
                        System.out.println("______________________________________");
                        System.out.println("Clã: Uchiha");
                        System.out.println("Habilidade especial: " + habilidadeEspecial[option]);
                        System.out.println("======================================");
                    }

                    //somar 1 a contagem para igualar ao ultimo item da lista
                    // array   0 1 2 3
                    // conta   1 2 3 4
                    //lista  1 2 3 4 5
                } else if (option > 1 && option <= contagem + 1) {
                    System.out.println("======Ninja======");
                    // subtrair 2 da opção escolhida para igualar ao indice em que o ninja está no array
                    System.out.println("Nome: " + Nome[option - 2] + " - " + Idade[option - 2] + " anos");
                    System.out.println("______________________________________");
                    System.out.println("Habilidade especial: " + habilidadeEspecial[option - 2]);

                } else {
                    System.out.println("Ninja indisponível, tente novamente");
                    mostrarInformacoes();
                }
            }
        }
    }

