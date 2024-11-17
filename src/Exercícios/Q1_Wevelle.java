package Exercícios;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Q1_Wevelle {
    public static void exibirNumerosPares(int entradaUsuario) {
        //método responsável por exibir os numeros pares de 0 até o valor dado pelo usuário ou identificar se ele é impar
        for (int x = 0; x <= entradaUsuario; x = x + 2) {
            //se o valor o usuario for par, exibir o valor x até esse número a cada repetição, somando de 2 em 2 a partir do 0
            if (entradaUsuario % 2 == 0) {
                System.out.print(x + " ");
            }
            //exibir mensagem identificando se for ímpar e quebrar a repetição do loop
            else {
                System.out.println("O número " + entradaUsuario + " é impar.");
                break;

            }
        }

    }

    public static void main(String[] args) {

        boolean reiniciar;
        int entradaUsuario = 0;
        //colocando o tratamento de exception dentro de um loop para reiniciar o programa e inserir um valor novamente no caso de um valor inválido
        do {
            //tornar a variavel reiniciar falso para caso não haja excessão, encerrar a condição do loop e prosseguir com o programa
            reiniciar = false;

            try {
                Scanner entrada = new Scanner(System.in);
                entradaUsuario = entrada.nextInt();
            } catch (InputMismatchException e) {
                //em caso de exception, alterar o valor da variavel reiniciar para atender a condição verdadeira do loop até que uma entrada válida seja inserida
                System.out.println("Valor inválido! Insira somente números.");
                reiniciar = true;
            }

        } while (reiniciar);
        //executar o método para exibir os resultados após checagem e correção de exception
        exibirNumerosPares(entradaUsuario);
    }
}



