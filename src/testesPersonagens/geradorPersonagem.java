package testesPersonagens;

import java.util.Scanner;
public class geradorPersonagem {
    public static void main(String[] args) {
        //gerador de Protagonista
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nomeProtagonista = scanner.nextLine();

        System.out.println("Qual o seu gênero? ");
        String generoProtagonista = scanner.nextLine();

        System.out.println("Qual a sua idade? ");
        int idadeProtagonista = scanner.nextInt();

        System.out.println("Qual o seu nivel poder?");
        int poder = scanner.nextInt();

        System.out.println("Qual a cor do seu cabelo? ");
        String corCabelo = scanner.nextLine();

        System.out.println("=================================");
        System.out.println("Você se chama " + nomeProtagonista + " é um(a) " + generoProtagonista + " de cabelos "+ corCabelo + ", possui " + idadeProtagonista + " e nivel de poder igual a " + poder + ".");

    }
}