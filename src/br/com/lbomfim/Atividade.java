/**
 * @author Lucas
 */
package br.com.lbomfim;

import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a sua média?\nDigite 'sim' ou 'não'");
        String response = s.next();

        while (response.equalsIgnoreCase("sim")) {

            System.out.println("Qual a sua nota da primeira unidade?");
            float media1 = s.nextFloat();

            System.out.println("Qual a sua nota da segunda unidade?");
            float media2 = s.nextFloat();

            System.out.println("Qual a sua nota da terceira unidade?");
            float media3 = s.nextFloat();

            System.out.println("Qual a sua nota da quarta unidade?");
            float media4 = s.nextFloat();

            float media = (media1 + media2 + media3 + media4) / 4;
            String result = exampleOfIf(media);
            System.out.println(" ");
            System.out.println("**************************************");
            System.out.println(result);
            System.out.println("**************************************");

            System.out.println(" ");
            System.out.println("Deseja gerar outra média?\nDigite 'sim' ou 'não'");
            response = s.next();
        }

        System.out.println("********************");
        System.out.println("Processo finalizado!");
        System.out.println("********************");
    }

    public static String exampleOfIf(float media) {

        String result;

        if (media >= 7) {
            result = "●▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬●\n" +
                    " ░░░░░░░░░░░VOCE FOI APROVADO!░░░░░░░░░░░░ \n" +
                    "●▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬●";
        } else if (media >= 5) {
            result = "●▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬●\n" +
                    " ░░░░░░░VOCE FOI PARA A RECUPERAÇÃO░░░░░░░ \n" +
                    "●▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬●";
        } else {
            result = "●▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬●\n" +
                    " ░░░░░░░░░░VOCE FOI REPROVADO!░░░░░░░░░░░░ \n" +
                    "●▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬●";
        }

        return result;
    }
}
