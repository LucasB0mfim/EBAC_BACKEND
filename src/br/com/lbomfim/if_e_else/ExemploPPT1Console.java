/**
 * @author Lucas
 */
package br.com.lbomfim.if_e_else;

import java.util.Scanner;

public class ExemploPPT1Console {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int result = s.nextInt();

        if (result == 1) {
            System.out.println("O resultado igual a 1");
        } else if (result > 1) {
            System.out.println("O resultado maior que 1");
        } else {
            System.out.println("O resultado menor que 1");
        }
    }
}
