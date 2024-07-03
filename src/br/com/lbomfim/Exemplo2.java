package br.com.lbomfim;

/**
 * @author Lucas
 */

public class Exemplo2 {
    public static void main(String[] args) {
        castingExplicito();
        castingImplicito();
    }

    public static void castingExplicito() {

        int num1 = 10;

        //implícito
        // short num2 = num1;

        //explícito
        short num3 = (short) num1;

        /*
          Por que não a primeira tentativa não funcionou?
          -> Em contexto de armazenamento o tipo short ocupa 16 bits,
          -> enquanto o tipo int ocupa 32 bits.
          -> A única maneira de fazer 32 bits ocuparem 16 bits é de forma explícita.
         */

        long numL = 1111111111111111111L;
        System.out.println(numL);

        int numI = (int) numL;
        System.out.println(numI);

        /*
          Quando você rodar o código, vai perceber que o valor de numL vai ser 'perdido/alterado'.
          Isso se dá pelo fato de contentar converter 64 bits (long) em 32 bits (int).
         */
    }

    public static void castingImplicito() {

        int idade = 10;
        System.out.println(idade);

        // Outro modo de converter
        System.out.println((long) idade);

        long idade_2 = idade + 10;
        System.out.println(idade_2);

        byte a = 1;
        System.out.println(a);

        short b = a;
        b += 1;
        System.out.println(b);

        /*
          Nesses casos o casting é feito automaticamente e não acontece nenhum erro. Porque?
          Porque você está convertendo um tipo de poucos bits para outro tipo de vários bits.
          Desse modo, os bits 'cabem' no novo tipo.
         */
    }
}
