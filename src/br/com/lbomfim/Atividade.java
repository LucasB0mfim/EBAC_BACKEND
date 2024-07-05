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

            float media = (media1 + media2 + media3) / 3;
            String result = exampleOfIf(media);
            System.out.println(" ");
            System.out.println("**************************************");
            System.out.println(result);
            System.out.println("**************************************");

            System.out.println(" ");
            System.out.println("Deseja gerar outra média?\nDigite 'sim' ou 'não'");
            response = s.next();
        }
    }

    public static String exampleOfIf(float media) {

        String result;

        if (media >= 7) {
            result = "Parabéns! Você foi aprovado";
        } else if (media >= 5) {
            result = "Você está de recuperação. Estude mais!";
        } else {
            result = "Infelizmente, você foi reprovado!";
        }

        return result;
    }
}
