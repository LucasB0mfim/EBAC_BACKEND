/**
 * @author Lucas
 */
package br.com.lbomfim.for_e_while;

import java.util.Scanner;

public class TabuadaWhile {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número?\nDigite 'sim' ou 'não'");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite um número para gerar a tabuada: ");
            int num = s.nextInt();

            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + num * i);
            }

            System.out.println("Deseja gerar novamente a tabuada de algum número?\nDigite 'sim' ou 'não'");
            resposta = s.next();
        }

        System.out.println("Obrigado!");
    }
}
