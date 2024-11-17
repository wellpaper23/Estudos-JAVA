package Exercícios;
import java.util.Scanner;
public class terreno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double larguraTerreno = 0,comprimentoTerreno = 0,valormQuadrado, areaDoTerreno, valorDoTerreno;
        System.out.print("Insira a largura do terreno: ");
        larguraTerreno = entrada.nextFloat();
        System.out.print("Insira o comprimento do terreno: ");
        comprimentoTerreno = entrada.nextFloat();
        System.out.print("Insira o valor do metro quadrado: ");
        valormQuadrado = entrada.nextFloat();
        areaDoTerreno = comprimentoTerreno * larguraTerreno;

        valorDoTerreno = areaDoTerreno * valormQuadrado;
        System.out.printf("A área do terreno é: %.2f\n", areaDoTerreno);
        System.out.printf("O preço do terreno é: %.2f\n", valorDoTerreno);

        entrada.close();
    }


}
