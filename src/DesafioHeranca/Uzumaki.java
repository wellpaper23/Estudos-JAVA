package DesafioHeranca;

public class Uzumaki extends Ninja {
    String ClaDoNinja = "Uzumaki";

    public void mostrarInformacoesTodosOsNinjas() {

        for (int i = 0; i < ClaUzumaki.contagem; i++) {

                System.out.println("nome = " + nome[i]);
                System.out.println("Clã: " + ClaDoNinja);
                System.out.println("idade = " + idade[i]);
                System.out.println("Missao = " + missao[i]);
                System.out.println("Nivel de dificuldade = " + nivelDeDificuldade[i]);
                System.out.println("Status da Missao = " + statusDaMissao[i]);
            }


    }
}
