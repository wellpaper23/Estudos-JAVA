package DesafioHeranca;

public class Uchiha extends Ninja {
    int contagemUchiha;
    String ClaDoNinja = "Uchiha";
    String habilidadeEspecial;
    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);

    }

    public void mostrarInformacoes() {

        System.out.println("nome = " + nome[numeroDoNinja]);
        System.out.println("Clã: " + ClaDoNinja);
        System.out.println("idade = " + idade[numeroDoNinja]);
        System.out.println("Missao = " + missao[numeroDoNinja]);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade[numeroDoNinja]);
        System.out.println("Status da Missao = " + statusDaMissao[numeroDoNinja]);
        mostrarHabilidadeEspecial();
    }

}