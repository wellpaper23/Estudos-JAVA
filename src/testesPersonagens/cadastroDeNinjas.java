package testesPersonagens;
import java.util.Scanner;
public class cadastroDeNinjas {
    private static int option;
    private static int ninjasMaximo = 3;
    private static String[] ninjas = new String[ninjasMaximo];
    public static Scanner entrada = new Scanner(System.in);
    private static int contagem = 0;

    public static void main(String[] args) {
        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            option = entrada.nextInt();
            entrada.nextLine();

            switch (option) {
                case 1:
                    cadastrarNinja();
                    break;
                case 2:
                    listarNinja();
                    break;
                case 3:
                    System.out.println("Cadastro encerrado com sucesso!");
                    break;
                default:
                    System.out.println("Essa opção não é válida!");
                    break;
            }
        } while (option != 3);
    }

    private static void listarNinja() {
        System.out.println("Os ninjas cadastrados são: ");
        if (ninjas == null){
            System.out.println("Nenhum ninja encontrado!");
        }else {
            for (int i = 0;i < contagem;i++){
                System.out.println(i+1 + "- " + ninjas[i]);
            }
        }
    }

    public static void cadastrarNinja() {
        if (contagem == ninjasMaximo){
            System.out.println("Limite de ninjas atingido!");
        }else {
            System.out.print("Digite o nome do ninja: ");
            String nome = entrada.nextLine();
            ninjas[contagem] = nome;
            contagem++;
            System.out.println("Ninja cadastrado com sucesso!");
        }
    }
}


