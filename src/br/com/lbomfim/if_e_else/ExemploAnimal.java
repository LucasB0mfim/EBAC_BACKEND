/**
 * @author Lucas
 */
package br.com.lbomfim.if_e_else;

import java.util.Scanner;

public class ExemploAnimal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = exampleOfIf(texto);
        System.out.println(animal);
    }

    public static String exampleOfIf(String animal) {

        String result;
        if (animal.equals("dog") || animal.equals("cat")) {
            result = "domestic animal";
        } else if (animal.equals("tiger")) {
            result = "wild animal";
        } else {
            result = "the animal is not in our database";
        }
        return result;
    }
}
