package DesafioHeranca;

public class Uchiha extends Ninja {
    static String ClaDoNinja = "Uchiha";
    static int contagemUchiha;
    static String habilidadeEspecial;
    public static void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
    public static void mostrarInformacoesTodosOsNinjas() {
        if (contagem <= 0) {
            System.out.println("Não há Ninjas para serem Exibidos.");

        }else if(contagemUchiha > 0){
            for (int i = 0; i < contagemUchiha; i++) {

                System.out.println("Nome = " + nome[i]);
                System.out.println("Clã: " + ClaDoNinja);
                System.out.println("idade = " + idade[i]);
                System.out.println("Missao = " + missao[i]);
                System.out.println("Nivel de dificuldade = " + nivelDeDificuldade[i]);
                System.out.println("Status da Missao = " + statusDaMissao[i]);
                mostrarHabilidadeEspecial();
                if (i == contagemUchiha-1) {
                    Uzumaki.mostrarInformacoesTodosOsNinjas();
                }
            }
        }
    }
}


