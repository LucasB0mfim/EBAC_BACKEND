/**
 * @author Lucas
 */
package br.com.lbomfim;

public class OperadoresAritmetricos {

    public static void main(String args[]) {
        operacoesAritmetricas();
        operacoesAtribuicoes();
        operacoesDeIncrementoDecremento();
        operacoesRelacionais();
        operacoesLogicas();
    }

    private static void operacoesLogicas() {

        System.out.println("");
        System.out.println("****Operacoes Lógicas****");

        int num1 = 10;
        int num2 = 10;

        boolean isDentro10 = num1 >= 1 && num1 <= 9;
        System.out.println("isDentro10: " + isDentro10);

        boolean isDentro_10 = num1 >= 1 || num1 <= 9;
        System.out.println("isDentro_10: " + isDentro_10);

        boolean isNot = num1 >= 1 || num1 <= 9;
        System.out.println("isNot: " + !isNot);
    }

    public static void operacoesRelacionais() {

        System.out.println("");
        System.out.println("****Operacoes Relacionais****");

        int num1 = 10;
        int num2 = 10;

        boolean isMaior = num1 > num2;
        System.out.println("isMaior: " + isMaior);

        boolean isIgual = num1 == num2;
        System.out.println("isIgual: " + isIgual);

        boolean isDiff = num1 != num2;
        System.out.println("isDiff: " + isDiff);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println("isMaiorIgual: " + isMaiorIgual);
    }

    public static void operacoesDeIncrementoDecremento() {

        System.out.println("");
        System.out.println("****Operacoes de Incremento e decremento****");
        int num1 = 10;
        System.out.println(num1);

        num1 ++;
        System.out.println(num1);

        num1--;
        System.out.println(num1);
    }

    public static void operacoesAtribuicoes() {

        System.out.println("");
        System.out.println("****Operações e Atribuições****");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;

        int numero4 =+ numero3;
        System.out.println(numero4);

        numero4 += numero4;
        System.out.println(numero4);
    }

    public static void operacoesAritmetricas() {

        System.out.println("");
        System.out.println("****Operações Aritmétricas****");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        System.out.println(num3);

        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (10 + 10) / 2;

        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}
