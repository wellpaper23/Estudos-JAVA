/*import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    static int maximoDeNinjas;
    static int numeroDoNinja;
    static int contagem = 0;

    public static void main(String[] args) {
        maximoDeNinjas = 100;
        Menu();
    }

    public static void Menu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1-Mostrar informações de todos os ninjas");
        System.out.println("2-Adicionar Ninja");
        System.out.println("3-Mostrar habiliade especial do ninja");
        System.out.println("4-Atualizar Habilidade especial do ninja");
        int option = scan.nextInt();
        scan.nextLine();
        switch (option){
            case 1:
                MostrarInformacoesTodosOsNinjas();
                break;
            case 2:
                CadastroDeNinjas();
                break;
            case 3:
                if (contagem == 0){
                    System.out.println("Não há ninjas para serem exibidos");
                    Menu();
                } else {
                    System.out.println("Qual Ninja deseja ver?");
                    numeroDoNinja = scan.nextInt();
                    Uchiha.mostrarInformacoes(numeroDoNinja);

                }
                break;
            case 4:
                if (contagem == 0){
                    System.out.println("Não há ninjas para serem atualizados");
                    Menu();
                } else {
                    System.out.println("Qual ninja deseja mudar a habilidade?");
                    numeroDoNinja = scan.nextInt();

                    System.out.print("Digite a nova habilidade: ");
                    Uchiha.habilidadeEspecial[numeroDoNinja] = scan.nextLine();
                    Menu();
                }
                break;
            default:
                System.out.println("Opção invalida");
                Menu();
                break;
        }
    }
    public static void CadastroDeNinjas(){
        numeroDoNinja = contagem;
        if (contagem == maximoDeNinjas){
            System.out.println("Limite de Ninjas atingido");
        }else {
            System.out.println("====Registre seu Ninja====");
            System.out.print("Nome: ");
            Ninja.Nome[numeroDoNinja] = scan.nextLine();
            System.out.print("Idade: ");
            Ninja.Idade[numeroDoNinja] = scan.nextLine();

            System.out.print("Clã: ");
            Ninja.ClaDoNinja[numeroDoNinja] =scan.nextLine();
            System.out.print("Missão: ");
            Ninja.Missao[numeroDoNinja] = scan.nextLine();
            System.out.print("Dificuldade da missão: ");
            Ninja.nivelDificuldade[numeroDoNinja] = scan.nextLine();
            System.out.print("Status da missão: ");
            Ninja.statusMissao[numeroDoNinja] = scan.nextLine();
            System.out.print("Habilidade especial: ");
            Uchiha.habilidadeEspecial[numeroDoNinja] = scan.nextLine();
            contagem ++;
            Menu();
        }
    }
    public static void MostrarInformacoesTodosOsNinjas() {
        String ClaDoNinja;
        if (contagem == 0) {
            System.out.println("Não há ninjas para serem exibidos");
            Menu();
        } else {
            for (int i = 0; i < contagem; i++){
                numeroDoNinja = i;
                System.out.println(i+1+"-"+Ninja.ClaDoNinja[numeroDoNinja]);
            }
            System.out.println("O seu ninja é um Uchiha?(S/N");
            ClaDoNinja = scan.nextLine();
            if (Objects.equals(ClaDoNinja, "S")) {
                for (int i = 0; i < contagem; i++) {
                    numeroDoNinja = i;
                    Uchiha.mostrarInformacoes(numeroDoNinja);
                }
            } else if (Objects.equals(ClaDoNinja, "N")) {
                for (int i = 0; i < contagem; i++) {
                    numeroDoNinja = i;
                    Ninja.mostrarInformacoes(numeroDoNinja);
                }
            } else {
                System.out.println("Clã Inválido, tente novamente!");
                MostrarInformacoesTodosOsNinjas();
                scan.nextLine();
            }
            Menu();
        }
    }
    public static void MostrarNinja(){
        for (int i = 0; i < contagem; i++){
            numeroDoNinja = i;
            System.out.println(i+"-"+Ninja.Nome[numeroDoNinja]);
        }
        numeroDoNinja = scan.nextInt();
        Ninja.mostrarInformacoes(numeroDoNinja);
    }

}
*/