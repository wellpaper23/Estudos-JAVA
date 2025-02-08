package DesafioHeranca;

public class Uchiha extends Ninja {
    String ClaDoNinja = "Uchiha";

    String habilidadeEspecial;
    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
    public void mostrarInformacoesTodosOsNinjas() {

            for (int i = 0; i < ClaUchiha.contagem; i++) {

                System.out.println("Nome = " + nome[i]);
                System.out.println("Clã: " + ClaDoNinja);
                System.out.println("idade = " + idade[i]);
                System.out.println("Missao = " + missao[i]);
                System.out.println("Nivel de dificuldade = " + nivelDeDificuldade[i]);
                System.out.println("Status da Missao = " + statusDaMissao[i]);
                mostrarHabilidadeEspecial();
        }
    }
}


