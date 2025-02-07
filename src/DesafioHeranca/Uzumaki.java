package DesafioHeranca;

public class Uzumaki extends Ninja {
    static String ClaDoNinja = "Uzumaki";
    static int contagemUzumaki;

    public static void mostrarInformacoesTodosOsNinjas() {
        if (contagem <= 0) {
            System.out.println("Não há Ninjas para serem Exibidos.");
        } else if (contagemUzumaki > 0) {
            for (int i = 0; i < contagemUzumaki; i++) {

                System.out.println("nome = " + nome[i]);
                System.out.println("Clã: " + ClaDoNinja);
                System.out.println("idade = " + idade[i]);
                System.out.println("Missao = " + missao[i]);
                System.out.println("Nivel de dificuldade = " + nivelDeDificuldade[i]);
                System.out.println("Status da Missao = " + statusDaMissao[i]);
            }
        }
        numeroDoNinja=0;
    }
}
