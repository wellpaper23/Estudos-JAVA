package Exercícios;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Q1_Wevelle {
    public static void exibirNumerosPares(int entradaUsuario) {
        //método responsável por exibir os numeros pares de 0 até o valor dado pelo usuário
        for (int x = 0; x <= entradaUsuario; x = x + 2) {
            if (entradaUsuario % 2 == 0) {
                System.out.print(x + " ");
            } else {
                System.out.println("O número " + entradaUsuario + " é impar.");
                break;

            }
        }

    }

    public static void main(String[] args) {

        boolean reiniciar;
        int entradaUsuario = 0;
        do {
            reiniciar = true;
            try {
                Scanner entrada = new Scanner(System.in);
                entradaUsuario = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Insira somente números.");
                reiniciar = false;
            }

        } while (!reiniciar);
        exibirNumerosPares(entradaUsuario);
    }
}



