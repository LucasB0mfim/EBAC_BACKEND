package br.com.lbomfim.array;

/**
 * O BubbleSort vai ordenar o array.
 * Exemplo: {2, 4, 1, 5, 3} -> {1, 2, 3, 4, 5}
 *
 * @author Lucas
 */

public class ExemploBubbleSortDinamico {

    public static void main(String[] args) {

        int[] array = {8, 9, 3, 5, 1};  // Vetor de inteiros a ser ordenado
        int temp;  // Variável temporária para troca de valores
        int indice;  // Índice para percorrer o vetor

        // Exibindo o vetor desordenado
        System.out.println("Vetor original:");
        for (indice = 0; indice < array.length; indice++) {
            System.out.println(" " + array[indice]);
        }
        System.out.println(" ");

        // Algoritmo de ordenação Bubble Sort
        for (indice = 0; indice < array.length; indice++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    // Troca dos elementos
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Exibindo o vetor ordenado
        System.out.println("Vetor organizado:");
        for (indice = 0; indice < array.length; indice++) {
            System.out.println(" " + array[indice]);
        }
    }
}
