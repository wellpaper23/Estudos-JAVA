package DesafioHeranca;

import java.util.Scanner;



public class Main {
    static Ninja informacoes = new Ninja();

    public static void main(String[] args) {
informacoes.ClaUzumaki = new Uzumaki();
informacoes.ClaUchiha = new Uchiha();


        Menu();
    }
    public static void Menu(){
        Scanner scanOption = new Scanner(System.in);

        boolean continuar=true;
        while (continuar) {
            int option;
            System.out.println("=====Arquivo Ninja=====");
            System.out.println("1-Adicionar Ninja");
            System.out.println("2-Mostrar Informações de todos os Ninjas");
            System.out.println("3-Mostrar Ninja");
            System.out.println("4-Mudar habilidade especial do Ninja");
            option = scanOption.nextInt();
            switch (option) {
                case 1:
                    informacoes.RegistrarNinja();

                    break;
                case 2:
                    informacoes.mostrarInformacoesTodosOsNinjas();
                    break;

                case 5:
                    continuar = false;
            }

        }
        scanOption.close();
    }

}

