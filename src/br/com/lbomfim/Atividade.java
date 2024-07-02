/**
 * @author Lucas
 */
package br.com.lbomfim;

public class Atividade {
    public static void main(String[] args) {
        calculaMedia();
    }

    public static void calculaMedia() {

        System.out.println(" ");
        System.out.println("****Calculando a média****");
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int media = (num1 + num2 + num3 + num4) / 4;

        System.out.println("A média dos números " + num1 + " " + num2 + " " + num3 + " " + num4 + " é: " + media);
    }
}
