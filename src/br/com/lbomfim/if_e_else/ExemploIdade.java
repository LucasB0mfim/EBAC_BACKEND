/**
 * @author Lucas
 */
package br.com.lbomfim.if_e_else;

import java.util.Scanner;

public class ExemploIdade {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade) {
        if (idade >= 0 && idade <= 5) {
            return "Você é um bebê";
        } else if (idade >= 6 && idade <= 10) {
            return "Você é uma criança";
        } else if (idade >= 11 && idade <18) {
            return "Você é adolescente";
        } else if (idade >= 19 && idade < 59) {
            return "Você é adulto";
        } else if (idade >= 60 && idade < 120) {
            return "Você é idoso";
        } else if (idade > 121) {
            return "Você tá morto";
        } else {
            return "Você é um espermatozoide ninja?";
        }
    }
}
